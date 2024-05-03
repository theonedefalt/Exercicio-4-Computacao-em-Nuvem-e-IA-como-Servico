import com.azure.ai.vision.imageanalysis.ImageAnalysisClient;
import com.azure.ai.vision.imageanalysis.ImageAnalysisClientBuilder;
import com.azure.core.credential.KeyCredential;

public class Main {
    public static void main(String[] args) {
        String endpoint = System.getenv("https://ti2cc.cognitiveservices.azure.com/");
        String key = System.getenv("486de91abe7d4bf2b850ce85f33ea489");

        if (endpoint == null || key == null) {
            System.out.println(
                    "Missing environment variable 'https://ti2cc.cognitiveservices.azure.com/' or '486de91abe7d4bf2b850ce85f33ea489'.");
            System.out.println("Set them before running this sample.");
            System.exit(1);
        }

        // Create a synchronous Image Analysis client.
        ImageAnalysisClient client = new ImageAnalysisClientBuilder()
                .endpoint(endpoint)
                .credential(new KeyCredential(key))
                .buildClient();

        // Create an asynchronous Image Analysis client.
        ImageAnalysisAsyncClient client = new ImageAnalysisClientBuilder()
                .endpoint(endpoint)
                .credential(new KeyCredential(key))
                .buildAsyncClient();
    }
}
