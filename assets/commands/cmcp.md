# TAGLINE

Confidential MCP gateway with TEE-backed policy enforcement

# TLDR

**Install** the runtime

```pip install cmcp-runtime```

**Validate** config and policy bundle before starting

```cmcp validate-config --config cmcp-config.yaml```

```cmcp validate-bundle --bundle-path ./policies --expected-hash sha256:[hex]```

**Start** the gateway in software / dev mode (no hardware TEE)

```CMCP_DEV_MODE=1 cmcp start --config cmcp-config.yaml```

**Verify** a signed TRACE claim file

```cmcp verify claim.json```

**Verify** with pinned policy and catalog hashes

```cmcp verify claim.json --policy-hash sha256:[hex] --catalog-hash sha256:[hex]```

# SYNOPSIS

**cmcp** _command_ [_options_]

# PARAMETERS

**start** **--config** _path_
> Start the cMCP gateway using the given YAML config. Listens for MCP-style tool calls, evaluates each against a Cedar policy bundle, and records a hardware-sealed (or software-signed in dev mode) audit chain.

**validate-config** **--config** _path_
> Parse and validate **cmcp-config.yaml** without starting the server.

**validate-bundle** **--bundle-path** _path_ **--expected-hash** **sha256:**_hex_
> Verify that a Cedar policy bundle directory matches an expected SHA-256 before deploy.

**verify** _claim_file_ [**--policy-hash** _h_] [**--catalog-hash** _h_] [**--max-age** _s_] [**--trusted-key** _path_] [**--audit-bundle** _path_] ...
> Offline verification of a TRACE / GatewayClaim: signature, schema, freshness, audit chain, and optional pinned hashes. Does not require trusting the operator who produced the claim.

# DESCRIPTION

**cmcp** is the CLI for **cMCP (Confidential MCP Runtime)**, an open-source gateway that sits between AI agents and MCP tools. Every **tools/call** is intercepted, evaluated against a **Cedar** policy bundle inside a policy engine intended to run in a **Trusted Execution Environment (TEE)**, then allowed, denied, or redacted. Sessions emit a signed **TRACE Claim** (GatewayClaim) that records which tools ran, which policy decided each call, the policy bundle hash measured at startup, and a hash-chained audit log.

Supported attestation providers include **TPM 2.0 / vTPM**, **AMD SEV-SNP**, and **Intel TDX** (with NVIDIA GPU confidential computing on the roadmap). When no hardware TEE is present, **CMCP_DEV_MODE=1** enables a software-only provider for local development; production starts should omit that flag so the gateway refuses to run without attestation hardware.

Typical config (**cmcp-config.yaml**) sets **attestation.provider** (**auto** or a specific provider), **enforcement_mode** (**enforcing**, **advisory**, or **silent**), **policy_bundle_path**, **catalog_path**, and **listen_addr**. Agents send JSON-RPC tool calls to the gateway HTTP endpoint instead of directly to upstream MCP servers.

# CONFIGURATION

**cmcp-config.yaml** (path required by **start** and **validate-config**). Important keys: **attestation.provider**, **attestation.enforcement_mode**, **policy_bundle_path** (directory of **.cedar** files plus **manifest.json**), **catalog_path** (approved tool catalog JSON), **listen_addr**.

Environment:

- **CMCP_DEV_MODE=1** — software-only TEE; no hardware required
- **CMCP_BEARER_TOKEN** — require this bearer token on inbound requests (needed beyond loopback in tokenless setups)
- **OPAQUE_ATTESTATION_URL** — opt-in OPAQUE managed runtime (placeholder / not fully implemented)

# CAVEATS

Developer preview: APIs and claim shapes may change before 1.0. **CMCP_DEV_MODE** claims verify only as partially_verified (no hardware attestation). Enforcement defaults to **enforcing** (HTTP 403 on deny). Running without a bearer token is intended for loopback only. Requires **Python 3.11+**. Residual risks and scope limits are documented in the project's **LIMITATIONS.md**.

# HISTORY

**cMCP** is maintained by **AgenTrust** under the MIT license. It was launched as a developer preview around the Confidential Computing Summit (2026) with PyPI package **cmcp-runtime**.

# SEE ALSO

[curl](/man/curl)(1), [pip](/man/pip)(1)

# RESOURCES

```[Source code](https://github.com/agentrust-io/cmcp)```

```[Homepage](https://github.com/agentrust-io/cmcp)```

```[Documentation](https://github.com/agentrust-io/cmcp/tree/main/docs)```

<!-- verified: 2026-08-04 -->
