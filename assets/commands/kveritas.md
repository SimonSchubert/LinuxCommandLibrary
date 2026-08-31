# TAGLINE

Tamper-evident verification for computational experiments

# TLDR

Start a session (**redacted** disclosure by default)

```kveritas init```

Run an experiment **under kveritas** (any command after `--`)

```kveritas run -- python [train.py] --epochs [90]```

Seal the session into a **signed PDF**

```kveritas seal --output [report.pdf]```

**Verify** a report (local crypto plus the server audit)

```kveritas verify [report.pdf]```

Verify **offline** (skip the server ledger)

```kveritas verify --offline [report.pdf]```

Work **without** the attestation server (self-attested seal)

```kveritas init --local```

Reveal **file names** in the report, or ship a **checkout bundle** of source

```kveritas init --show-names```

```kveritas init --disclosure open```

Prove a file was in a signed snapshot **without revealing the rest**

```kveritas prove [report.pdf] [src/train.py]```

```kveritas verify-proof [kveritas-proof.json]```

Reconstruct a snapshot from an **open-disclosure bundle**

```kveritas checkout [report.pdf.kvbundle.zip] run_end [/tmp/out] --report [report.pdf]```

Record a **hash-chained agent session** (installs Claude Code hooks)

```kveritas init --harness```

Check paper claims against a **signed report**

```kveritas check --claims [claims.json] --report [report.pdf]```

# SYNOPSIS

**kveritas** _command_ [_options_]

**kveritas** **init** [**--local**] [**--harness**] [**--disclosure** redacted|names|open] [**--show-names**]

**kveritas** **run** [**--files** _f1,f2_] **--** _command_ [_args_...]

**kveritas** **seal** [**-o** _path_] [**--local-key** _pem_]

**kveritas** **verify** _report.pdf_|_session.json_|_proof.json_ [**--offline**] [**--bundle** _zip_] [**--paper** _pdf_]

# COMMANDS

**init**
> Create a `.kveritas` session in the current directory.

**run**
> Run a command as a monitored subprocess. Captures stdout/stderr hashes, protocol lines, hardware samples, and (on Linux) per-process activity.

**seal**
> Sign the session into a PDF report. Open disclosure also writes `report.pdf.kvbundle.zip`. Deletes `.kveritas` on success.

**verify**
> Check a sealed PDF, harness `session.json`, or embedded proof. Default also runs the server audit; **--offline** stays local.

**prove** / **verify-proof**
> Build or check a selective-disclosure proof that named files were in a signed snapshot.

**checkout**
> Reconstruct files for one snapshot from a checkout bundle. Pass **--report** to bind the zip to the signature.

**check** / **generate-claims**
> Compare a claims JSON file to signed metrics, or print a template from a report.

**record**
> Append a designated action to a harness session (also invoked by Claude Code hooks).

**harness-prove** / **verify-harness-proof**
> Prove one recorded prompt or output against its committed hash.

**status** / **update** / **clean**
> Show session state, replace the binary from the release channel, or remove `.kveritas`.

# PARAMETERS

**--local**
> Init without the attestation server. Seal with a local RSA key (self-attested, not server-origin).

**--harness**
> Init a hash-chained agent session instead of an experiment session. Signs genesis with the server (or **--local**).

**--disclosure** redacted|names|open
> How much provenance the report reveals. Default **redacted** (pseudonyms, no names, no content). Integrity is always committed.

**--show-names**
> Keep real file names in the report without bundling content (same as **--disclosure names**).

**--files** _list_
> Extra source files to hash before and after **run**. If omitted, script-like arguments (`.py`, `.sh`, `.r`, ...) are hashed automatically.

**-o**, **--output** _path_
> Output PDF for **seal** (default `kveritas-report-<id>.pdf`) or proof JSON for **prove**.

**--local-key** _pem_
> RSA private key for offline **seal**. Default `keys/private.pem` in local mode.

**--offline**
> **verify** without contacting the ledger.

**--bundle** _zip_
> Checkout/source bundle for **verify**. Hashes are compared to the seal; the server audit can run a code review.

**--paper** _pdf_
> Manuscript PDF for **verify**. The server cross-checks claimed numbers against sealed telemetry.

**--public-key** _pem_
> Trust-anchor public key for **verify**. Without it, origin is checked against the pinned K-Veritas key.

**--claims** _file_ / **--report** _file_
> Required pair for **check**. **generate-claims** needs **--report** only and prints JSON to stdout.

**--report** _pdf_
> On **checkout**, verify the bundle hash against this sealed report before writing files.

**--input** / **--output-content** / **--tool-use-id**
> **harness-prove**: reveal prompt or response bytes, and select the chain entry by index or tool-use id.

# DESCRIPTION

**kveritas** binds a published result to the exact code, hardware, and time that produced it, and writes a cryptographically signed PDF anyone can verify. It wraps existing commands (any language). The binary is a single static Go program with no runtime dependencies.

A typical experiment session is **init**, one or more **run**s, then **seal**. During a run, kveritas tees stdout, hashes I/O, samples hardware at about 10 Hz, and parses protocol lines. At seal time it signs canonical JSON of the session with RSA-PSS-SHA256 (4096-bit). The public key, hashes, nonce, and canonical bytes are embedded after the PDF `%%EOF` between `%%KVERITAS_SEAL_BEGIN%%` and `%%KVERITAS_SEAL_END%%`.

**verify** recomputes the data hash, checks the RSA-PSS signature, then distinguishes **VERIFIED** (signed by the K-Veritas trust anchor) from **SELF-ATTESTED** (valid signature on an author-supplied key). Unless **--offline** is set, it also asks the public verifier at kveritas.org for ledger status, HMCA coherence, optional bundle match, code audit, and paper cross-check.

HMCA (execution coherence) never looks at the reported metric. It scores whether CPU, memory, I/O, and GPU channels co-fluctuate as one process. Verdicts are **PASS**, **WARN**, **FAIL**, or **N/A**. If a run declares a model card (`KVERITAS_MODEL`), seal also attests compute cost against time, energy, and memory bounds; a hard violation is **FABRICATION-IMPOSSIBLE** and is bound into the signature.

Provenance is a Merkle-linked timeline of content-addressed snapshots. Disclosure only changes what the report shows. Patterns in **.kveritasignore** keep files out of any checkout bundle; withheld files remain hash-only leaves so they cannot be dropped silently.

Harness mode (`init --harness`) records designated agent actions as a hash chain. Claude Code hooks are installed into `.claude/settings.json`. A failed **pre** hook exits 2 so a designated tool cannot run without its chain entry.

# PROTOCOL LINES

Print these on stdout from any language. They are hashed into the signed record.

**KVERITAS_METRIC** name=_id_ value=_float_ [step=_label_]
> Record a metric. Keras history, sklearn CV, and metric-like locals are also auto-detected.

**KVERITAS_PHASE** name=_phase_
> Mark a phase boundary (hardware snapshot).

**KVERITAS_CLAIM** metric=_id_ value=_float_ [phase=_phase_]
> Commit a headline claim.

**KVERITAS_INPUT** src=seed:_value_
> Commit a random seed.

**KVERITAS_MODEL** params=_int_ arch=_name_ precision=fp16|bf16|fp32
> Model card (feeds compute-cost attestation).

**KVERITAS_WORKLOAD** dataset_size=_int_ epochs=_float_ batch_size=_int_ [seq_len=_int_]
> Workload card.

**KVERITAS_ARTIFACT** role=model|dataset [name=_ref_] path=_file_ visibility=public|private
> Attest a model or dataset. Public artifacts store a content hash; private ones store a salted commitment.

# CONFIGURATION

**.kveritas/**
> Session directory created by **init**. Holds the token, run records, proof keystore, and bundles. **seal** removes it; **clean** removes it without sealing.

**.kveritasignore**
> Gitignore-style patterns. Matching files are withheld from checkout bundles but still committed as hashes.

**.claude/settings.json**
> Harness mode appends PreToolUse, PostToolUse, and UserPromptSubmit hooks that call **kveritas record --hook**.

# CAVEATS

Only runs that exit 0 are saved. A failing command is discarded (the server ledger may still count the invocation). **seal** refuses if hashed source files changed after the runs.

Per-process hardware attribution and the file/subprocess activity map are **Linux-only**. Elsewhere, sampling falls back to system-wide readings. Verify, seal, proofs, checkout, and disclosure levels are cross-platform.

Default **init** talks to the K-Veritas attestation server. **--local** (or **--local-key**) produces a self-attested report: the signature is valid, but **verify** will not treat origin as server-signed.

The proof keystore (`report.pdf.provkey.json`) stays next to the PDF and is needed for **prove**. Do not publish it if the report is redacted. Checkout bundles never include datasets or weights.

The CLI, protocol, and verification libraries are Apache-2.0. The attestation server in the same repository is AGPL-3.0. "K-Veritas" is a trademark; the license does not grant rights to run a service that implies official certification.

# HISTORY

K-Veritas is an open verification protocol from **27-GROUP**, with the Go CLI and attestation server in **kveritas-go**. The client is a Cobra program that signs session JSON with RSA-PSS-SHA256 and embeds the seal in a self-contained PDF.

# SEE ALSO

[python](/man/python)(1), [in-toto-run](/man/in-toto-run)(1), [cosign](/man/cosign)(1), [sha256sum](/man/sha256sum)(1), [openssl](/man/openssl)(1), [git](/man/git)(1), [claude](/man/claude)(1)

# RESOURCES

```[Source code](https://github.com/27-GROUP/kveritas-go)```

```[Homepage](https://kveritas.org)```

```[Documentation](https://kveritas.org/docs)```

<!-- verified: 2026-08-31 -->
