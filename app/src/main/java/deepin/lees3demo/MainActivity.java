package deepin.lees3demo;

import android.app.Activity;
import android.os.Bundle;

import com.amazonaws.Request;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferUtility;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.S3ClientOptions;
import com.amazonaws.services.s3.model.PutObjectRequest;

import java.io.File;

public class MainActivity extends Activity {
    private AmazonS3Client s3;
    private AWSCredentials creds;
    private S3ClientOptions accelerateOption;

    private AmazonS3Client sS3Client;
    private CognitoCachingCredentialsProvider sCredProvider;
    private TransferUtility sTransferUtility;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        creds = new BasicAWSCredentials("accessKey", "secretKey");
//        s3 = new AmazonS3Client(creds);
//        accelerateOption = S3ClientOptions.builder().setAccelerateModeEnabled(true).build();
//
//        final String region = "us-west-2";
//        s3.setEndpoint(String.format("s3-%s.amazonaws.com", region));


    }

    public void testCreateRequestNonDNS() {
//        final String bucketName = "bucket.with.dot";
//        final String key = "key";
//        final File file = new File(key);
//        final HttpMethodName method = HttpMethodName.PUT;
//        final PutObjectRequest originalRequest = new PutObjectRequest(bucketName, key, file);
//        final Request<?> request = s3.createRequest(bucketName, key, originalRequest, method);

    }
}
