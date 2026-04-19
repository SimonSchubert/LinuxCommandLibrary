# TAGLINE

Local AWS cloud emulator for integration tests

# TLDR

**Start the emulator** on _http://localhost:4566_

```fakecloud```

**Install fakecloud** via the one-line installer

```curl -fsSL https://raw.githubusercontent.com/faiscadev/fakecloud/main/install.sh | bash```

**Enable SigV4 signature verification** (closer to real AWS)

```fakecloud --verify-sigv4```

**Enable strict IAM policy enforcement**

```fakecloud --iam [strict]```

**Create an SQS queue** against the running emulator

```aws --endpoint-url http://localhost:4566 sqs create-queue --queue-name [my-queue]```

**Install with Cargo**

```cargo install fakecloud```

**Run inside Docker**

```docker run -p 4566:4566 faisca/fakecloud```

# SYNOPSIS

**fakecloud** [_options_]

# PARAMETERS

**--verify-sigv4**
> Enable cryptographic signature verification so that clients must sign requests exactly as they would for real AWS.

**--iam** _MODE_
> IAM policy enforcement. _soft_ evaluates but does not block; _strict_ denies unauthorized calls. Defaults to off.

**--port** _PORT_
> Listen on an alternate TCP port (default _4566_).

**--host** _ADDR_
> Bind to a specific interface (default _127.0.0.1_).

**--data-dir** _DIR_
> Directory used to persist emulated state between runs.

**-h**, **--help**
> Show help and exit.

**-V**, **--version**
> Print version and exit.

# DESCRIPTION

**fakecloud** is a single self-contained binary (~19 MB, ~10 MiB RSS, ~500 ms startup) that emulates the most common AWS services locally — S3, SQS, SNS, DynamoDB, Lambda, IAM, and more — so that integration tests do not need cloud credentials or internet access. Point any AWS SDK or the **aws** CLI at _http://localhost:4566_ with dummy credentials (**access_key=test**, **secret_key=test**) and it responds with the same wire protocol as the real service.

First-party test SDKs exist for TypeScript, Python, Go, PHP, Java, and Rust. fakecloud itself has no runtime dependency on Docker, though a container image is provided for CI convenience.

# CONFIGURATION

Typical test configuration in TypeScript:

```
import { S3Client } from "@aws-sdk/client-s3";

const s3 = new S3Client({
  endpoint: "http://localhost:4566",
  region: "us-east-1",
  credentials: { accessKeyId: "test", secretAccessKey: "test" },
  forcePathStyle: true,
});
```

State can be persisted between test runs by passing **--data-dir**; otherwise each start is a clean slate.

# CAVEATS

fakecloud covers the common AWS services but is not bit-for-bit identical with production AWS — obscure error codes, quota behaviors, and eventual-consistency edge cases may differ. Only use it for integration tests, not as a production replacement. The project is licensed **AGPL-3.0**, which matters if you plan to redistribute it as part of a SaaS.

# HISTORY

**fakecloud** was launched by **faiscadev** in early **2026** after **LocalStack** announced its shift to a proprietary license, giving teams a free-forever, open-source alternative for fully local AWS testing.

# SEE ALSO

[aws](/man/aws)(1), [localstack](/man/localstack)(1), [moto](/man/moto)(1), [terraform](/man/terraform)(1)
