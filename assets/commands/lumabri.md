# TAGLINE

Peer-to-peer MoE model swarm for distributed LLM inference

# TLDR

**Serve** a local model directory on the swarm (tracker + bytes + optional expert compute)

```lumabri serve --model [/path/to/model]```

**Chat** against a tracker, using colibri engine binaries from a local tree

```lumabri chat --tracker [host:7300] --engines-dir [/path/to/colibri/c]```

Open the interactive front end with **saved swarm settings** (no flags)

```lumabri```

Generate an **operator keypair** for a signed swarm

```lumabri key --out [swarm]```

Serve and **join** an existing tracker while donating disk space

```lumabri serve --model [./slice] --join [host:7300] --model-name [model] --donate [GB]```

Chat against a **local** model directory (no mirror, no second copy)

```lumabri chat --local [/path/to/model] --engines-dir [/path/to/colibri/c]```

# SYNOPSIS

**lumabri** [_subcommand_] [_options_]

# DESCRIPTION

**lumabri** runs huge mixture-of-experts (MoE) language models across a swarm of peers using the [colibri](https://github.com/JustVugg/colibri) engine. Pure C, no runtime dependencies beyond a colibri build for the engine binaries. One machine can share a model; others chat without downloading the full weights up front. Bytes that inference actually touches are fetched from peers, verified, and kept in a local mirror under **~/.lumabri** so later prompts can run offline from cache.

**serve** starts a tracker (index of who holds which files) and a maintainer that answers byte-range reads. With phase 2 enabled it can also run expert execution for peers. **chat** boots a colibri engine against a model path that may exist only on the swarm: an **LD_PRELOAD** shim fetches missing blocks, and optional expert offload sends activations to peers that hold those experts. With no arguments, **lumabri** prompts for swarm address and key once and remembers them in **~/.lumabri/config**.

Integrity modes include open swarms (per-MiB hashes, optional operator signatures, spot-check of expert results) and private swarms gated by **LUMABRI_TOKEN**. Design goals emphasize byte-identical output whether experts run locally or remotely, and a hardware floor that includes CPU-only machines.

# SUBCOMMANDS

**serve**

> Share a model: run tracker/maintainer (and usually expert execution). Flags include **--model**, **--port**, **--join**, **--donate**, **--model-name**, **--key**, **--advertise**, **--cache** / **--exec-cache**, **--no-exec**.

**chat**

> Connect to a swarm or a local model. Flags include **--tracker**, **--engines-dir**, **--local**, **--role**, **--donate**, **--model-dir**. In-chat commands include **/swarm** and **/model**.

**key**

> Create an Ed25519 operator keypair (**--out** path) for signed swarms.

# ENVIRONMENT

**LUMABRI_TOKEN**

> Shared invite secret for private swarms; required on every node when set.

**LUMABRI_PUBKEY**

> Operator public key (hex) for verifying signed model hashes out of band.

**LUMABRI_REQUIRE_HASH**

> When set to 1, refuse fetches without integrity data.

**LUMABRI_VERIFY**

> Spot-check fraction for phase-2 expert results on a second replica.

**LUMABRI_PREFETCH**

> Readahead block count for cold mirrors (default 2).

# CAVEATS

Requires **Linux**, **gcc**, **GNU make**, and a matching **colibri** checkout for engine binaries (**make phase2-all ENGINE=...** for peer expert execution). First cold answers are network-bound while the working set is mirrored. Misconfigured **--engines-dir** or missing keys can cause huge downloads or unverified models; the interactive default path is intentionally safer than raw flags. Tracker/maintainer/executor ports (commonly **7300–7302**, plus offsets per extra model) must be reachable for multi-host swarms. Status is a working prototype: features such as speculative drafting and key rotation remain incomplete.

# SEE ALSO

[ollama](/man/ollama)(1), [llama.cpp](/man/llama-cli)(1)

# RESOURCES

```[Source code](https://github.com/JustVugg/lumabri)```

<!-- verified: 2026-08-10 -->
