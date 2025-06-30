package islam.farhad.exercises.java8AsynchronousProgramming;

import java.io.IOException;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AsyncFileReader {
    private static final String DIRECTORY_PATH = "CACHE";
    private static final ExecutorService executor = Executors.newFixedThreadPool(5); // Thread pool

    public static void main(String[] args) {
        readFilesAsync(DIRECTORY_PATH);
    }

    public static void readFilesAsync(String directoryPath) {
        try (Stream<Path> files = Files.list(Paths.get(directoryPath))) {
            List<CompletableFuture<Void>> futures = files
                    .filter(Files::isRegularFile) // Only process files
                    .map(file -> CompletableFuture.supplyAsync(() -> readFileSafely(file), executor)
                            .thenAccept(content -> {
                                if (content != null) {
                                    System.out.println("File: " + file.getFileName());
                                    System.out.println("Content: \n" + content);
                                }
                            })
                            .exceptionally(ex -> {
                                System.err.println("Error processing file: " + file + " - " + ex.getMessage());
                                return null;
                            })
                    ).collect(Collectors.toList());

            // Wait for all async tasks to complete
            CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).join();

        } catch (IOException e) {
            System.err.println("Error reading directory: " + e.getMessage());
        } finally {
            executor.shutdown();
        }
    }

    private static String readFileSafely(Path file) {
        try {
            if (!Files.exists(file)) {
                System.out.println("File deleted before reading: " + file.getFileName());
                return null;
            }
            return new String(Files.readAllBytes(file), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.err.println("Error reading file: " + file.getFileName() + " - " + e.getMessage());
            return null;
        }
    }
}

