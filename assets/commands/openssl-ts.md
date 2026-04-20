# TAGLINE

handles RFC 3161 Time Stamping Authority operations

# TLDR

**Create timestamp request**

```openssl ts -query -data [file] -out [request.tsq]```

**Create timestamp response**

```openssl ts -reply -queryfile [request.tsq] -signer [cert.pem] -out [response.tsr]```

**Verify timestamp**

```openssl ts -verify -data [file] -in [response.tsr] -CAfile [ca.pem]```

**Print timestamp request**

```openssl ts -query -in [request.tsq] -text```

# SYNOPSIS

**openssl** **ts** _command_ [_options_]

# PARAMETERS

**-query**
> Create timestamp request.

**-reply**
> Create timestamp response.

**-verify**
> Verify timestamp response.

**-data** _file_
> Data file to timestamp.

**-in** _file_
> Input file.

**-out** _file_
> Output file.

**-text**
> Print in human-readable form.

**-config** _FILE_
> Specify a custom `openssl.cnf`.

**-queryfile** _FILE_
> Path to an existing TSQ when generating a reply (**-reply**) or during verification (**-verify**).

**-digest** _HEX_
> Provide a precomputed digest instead of hashing `-data`.

**-no_nonce**
> Do not include a nonce in the request.

**-cert**
> Request that the TSA include its certificate in the reply.

**-signer** _FILE_
> Signing certificate (PEM) used by **-reply**.

**-inkey** _FILE_|_URI_
> Private key matching `-signer`.

**-chain** _FILE_
> Extra certificates to include in the response chain.

**-tspolicy** _OID_
> Policy OID asserted by the TSA.

**-untrusted** _FILES_
> Untrusted intermediates for chain building during **-verify**.

**-CAfile** _FILE_, **-CApath** _DIR_, **-CAstore** _URI_
> Trust anchors used during **-verify**.

**-attime** _TIMESTAMP_
> Verify as if at a specific time.

**-token_in**, **-token_out**
> Read/write a bare PKCS#7 token rather than a full TimeStampResp.

# DESCRIPTION

**openssl ts** handles RFC 3161 Time Stamping Authority (TSA) operations. It creates timestamp requests (TSQ), generates responses (TSR) as a TSA server, and verifies existing TSRs. It is primarily used to prove that data existed in a specific form at a specific time — document notarization, code-signing countersignatures, and archival integrity.

The three operating modes are mutually exclusive:

- **-query** — client-side request creation.
- **-reply** — server-side response creation (requires a signer certificate and key).
- **-verify** — client-side verification of a response against the original data (or digest) and a trust store.

# CAVEATS

Requires that the TSA certificate chains to a CA in the supplied trust store. Using **-no_nonce** makes the response replayable — avoid unless the protocol you are integrating with mandates it. In the OpenSSL 3 series this command is also exposed as `openssl-ts(1ssl)` in the manual.

# SEE ALSO

[openssl](/man/openssl)(1), [x509](/man/x509)(1ssl), [gpg](/man/gpg)(1)

