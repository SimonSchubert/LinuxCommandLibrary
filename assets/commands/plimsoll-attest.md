# TAGLINE

Sign, verify, and replay Plimsoll sandbox run records

# TLDR

**Generate** an Ed25519 key pair (`harness.key` mode 0600, `harness.pub`)

```plimsoll-attest keygen -out [harness]```

**Run** a request and append its signed record

```plimsoll-attest run -daemon [http://127.0.0.1:8746] -key [harness.key] -bundle [runs.jsonl] [request.json]```

**Verify** a bundle's signatures, digests, and chain

```plimsoll-attest verify -pub [harness.pub] [runs.jsonl]```

Verify against a **list of request hashes** (one `request_sha256` per line)

```plimsoll-attest verify -pub [harness.pub] -expect [requests.txt] [runs.jsonl]```

**Replay** every run in a fresh session and compare results

```plimsoll-attest replay -daemon [http://127.0.0.1:8746] -pub [harness.pub] [runs.jsonl]```

# SYNOPSIS

**plimsoll-attest** **keygen** **-out** _prefix_

**plimsoll-attest** **run** **-daemon** _url_ [**-key** _file_] **-bundle** _file_ [_-shared-bundle_] [_-timeout_ _duration_] _request.json_

**plimsoll-attest** **verify** **-pub** _file_ [_-expect_ _file_ | **-expect-count** _n_] _bundle_

**plimsoll-attest** **replay** **-daemon** _url_ **-pub** _file_ _bundle_

# DESCRIPTION

**plimsoll-attest** is a harness that runs **outside** **plimsolld**. It makes a signing key, submits a run, signs the checked record into a JSONL **bundle**, verifies that bundle (signatures, digests, link chain, session chains, and optionally the caller's own request list), and replays recorded runs against a daemon to compare results. The signing key never goes to the daemon.

The request file is a `plimsoll.v1.RunRequest` in protobuf JSON, for example `{"protocol": 2, "javascript": {"code": "console.log(1)"}}`. The daemon bearer is **PLIMSOLL_CALLER_TOKEN**. The signing key is **-key** or **PLIMSOLL_ATTEST_KEY** (the PEM itself) so neither appears in a process listing.

**run** takes a lock on the bundle so concurrent runs take turns (no lock on Windows, Solaris, illumos, or AIX: run one at a time there). Default timeout is **6 minutes**. A new bundle is created mode **0600**. A bundle other users can read is refused unless **-shared-bundle**. If the append fails after the run, a signed unsealed side file is kept beside the bundle rather than dropping the record. **keygen** uses **O_EXCL** and will not overwrite an existing `.key`.

Build from `cmd/plimsoll-attest` in the Plimsoll module (`go install github.com/plimsollmark/plimsoll/cmd/plimsoll-attest@latest`).

# COMMANDS

**keygen** **-out** _prefix_
> Write _prefix_`.key` (mode 0600) and _prefix_`.pub`. Fails if the key file already exists

**run**
> Run one request, sign the exchange, append it to the bundle under a lock, and print the sandbox, isolation, record SHA-256, and request SHA-256 (the line for **verify -expect**)

**verify**
> Check signatures, digests, the bundle chain, and session chains. **-expect** requires the bundle to hold exactly the request digests listed, one `request_sha256` per line. **-expect-count** checks the number of calls

**replay**
> Verify as **verify** does, then send each single run again and each recorded session's calls, in order, into a fresh session, and compare results

# ENVIRONMENT

**PLIMSOLL_CALLER_TOKEN**
> Bearer token for the daemon. Omit for an open development daemon

**PLIMSOLL_ATTEST_KEY**
> Signing key PEM when **-key** is not given

# CAVEATS

A bundle signed by another key, or written before bundle links, cannot be continued: start a new one. A crash that leaves a partial last line can be repaired by cutting back to the last checkpoint. Bundles hold the submitted code and its output; keep them owner-only. Unknown subcommands and missing arguments exit **2**. A run that errors has no record and leaves the bundle unchanged.

# HISTORY

Part of **Plimsoll** (`plimsollmark/plimsoll`), Apache-2.0. The binary lives at `cmd/plimsoll-attest`.

# SEE ALSO

[plimsolld](/man/plimsolld)(1), [plimsoll-clients](/man/plimsoll-clients)(1), [plimsoll-specgen](/man/plimsoll-specgen)(1), [prospector-report](/man/prospector-report)(1), [go](/man/go)(1)

# RESOURCES

```[Source code](https://github.com/plimsollmark/plimsoll)```

```[Documentation](https://github.com/plimsollmark/plimsoll/blob/main/docs/run-records.md)```

<!-- verified: 2026-10-12 -->
