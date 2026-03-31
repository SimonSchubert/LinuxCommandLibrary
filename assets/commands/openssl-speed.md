# TAGLINE

Benchmark cryptographic algorithm performance

# TLDR

**Run all default benchmarks**

```openssl speed```

**Benchmark a specific algorithm**

```openssl speed [aes-256-cbc]```

**Benchmark multiple algorithms**

```openssl speed [sha256] [sha512] [aes-128-gcm]```

**Benchmark using the EVP interface**

```openssl speed -evp [aes-256-gcm]```

**Run benchmarks for a specific duration** in seconds

```openssl speed -seconds [10] [rsa2048]```

**Run benchmarks with specific buffer sizes**

```openssl speed -bytes [8192] [aes-256-cbc]```

**Use multiple parallel operations**

```openssl speed -multi [4] [sha256]```

**Output results in machine-readable format**

```openssl speed -mr [aes-256-cbc]```

# SYNOPSIS

**openssl** **speed** [_options_] [_algorithm ..._]

# PARAMETERS

**-help**
> Display usage information and exit.

**-elapsed**
> Use wall-clock time instead of CPU user time when calculating throughput.

**-evp** _algo_
> Use the specified cipher or message digest algorithm via the EVP interface. Required for testing algorithms not in the pre-compiled list.

**-hmac** _digest_
> Benchmark HMAC using the specified message digest.

**-cmac** _cipher_
> Benchmark CMAC using the specified cipher.

**-multi** _num_
> Run _num_ parallel benchmarks simultaneously.

**-async_jobs** _num_
> Activate asynchronous mode and start the specified number of jobs.

**-misalign** _num_
> Offset test buffers by _num_ bytes to test misaligned access performance.

**-decrypt**
> Measure decryption instead of encryption (EVP testing only).

**-mb**
> Enable multi-block mode for EVP ciphers that support it.

**-aead**
> Benchmark an AEAD cipher in a TLS-like sequence.

**-primes** _num_
> Generate a multi-prime RSA key with _num_ primes (RSA testing only).

**-seconds** _num_
> Run each benchmark for _num_ seconds instead of the default 3.

**-bytes** _num_
> Run benchmarks on buffers of _num_ bytes.

**-mr**
> Output results in a machine-readable format.

**-rand** _files_
> Specify files to seed the random number generator.

**-writerand** _file_
> Write random data to the specified file on exit.

**-engine** _id_
> Select an engine by ID (deprecated in OpenSSL 3.0).

**-provider** _name_
> Load and use the specified provider.

# DESCRIPTION

**openssl speed** tests the performance of cryptographic algorithms by running repeated operations and measuring throughput. It reports operations per second for public-key algorithms and bytes per second for symmetric ciphers and hashes, testing across multiple buffer sizes (16, 64, 256, 1024, 8192, and 16384 bytes).

When run without arguments, it benchmarks a pre-compiled selection of common algorithms including AES, SHA, RSA, and elliptic curves. Specific algorithms can be selected as arguments, and the **-evp** flag allows testing any algorithm available through OpenSSL's EVP interface.

Results help identify the most efficient algorithms for a given system and can reveal hardware acceleration benefits (e.g., AES-NI instructions).

# CAVEATS

Only a pre-compiled subset of algorithms can be tested by name directly; use **-evp** for others. The **-multi** option forks separate processes rather than using threads, so results may not reflect real multithreaded application performance. Benchmarks measure raw cryptographic throughput without protocol overhead, so actual TLS performance will differ. The **-engine** option is deprecated since OpenSSL 3.0 in favor of providers.

# HISTORY

The **speed** subcommand has been part of OpenSSL since its earliest releases, inherited from **SSLeay** (Eric Young's SSL library) in the **late 1990s**. It has been extended over time to support EVP, AEAD, multi-prime RSA, asynchronous jobs, and the provider architecture introduced in **OpenSSL 3.0** (September 2021).

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-dgst](/man/openssl-dgst)(1), [openssl-rand](/man/openssl-rand)(1)
