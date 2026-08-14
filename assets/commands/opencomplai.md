# TAGLINE

EU AI Act compliance checks for local repos and CI

# TLDR

**Install** the CLI, core engine, and Python SDK

```pip install opencomplai```

**Discover** AI signals in a repo (no manifest, always exits 0)

```opencomplai scan --quick .```

**Create** a system manifest

```opencomplai init --system-id [id] --intended-purpose "[purpose]"```

**Run** the CI compliance gate

```opencomplai check```

**Emit** the status artifact as JSON

```opencomplai check --scan-mode ci --output json```

**Open** the EU AI Act applicability checker in a browser

```opencomplai checker --web```

```opencomplai checker --web --local```

# SYNOPSIS

**opencomplai** _command_ [_options_]

# DESCRIPTION

**opencomplai** is the command-line front end of OpenComplAI, an open-core toolkit that turns EU AI Act obligations into machine-readable, CI-gateable checks. **pip install opencomplai** installs the meta-package (CLI + **opencomplai-core** + Python SDK). The console script is also provided by **opencomplai-cli**. Python **3.11+** is required. There is no **--version** flag; use **opencomplai --help**.

Typical flow: **scan --quick** to see whether the tree looks like it touches AI, **init** to write **system-manifest.json** and create **~/.opencomplai/** (Ed25519 signing keypair + **config.yaml** on first run), then **check** to evaluate controls and write **compliance-artifact.json**. The scanner corroborates a declared **intended_purpose** against code signals; it never auto-classifies risk. Finding no AI is not a pass.

**check** is the contractual CI gate. Exit codes: **0** PASS, **1** CONTROL_FAIL, **2** VALIDATION_FAIL, **3** POLICY_BLOCK, **4** TRAP_DETECTED. **TRAP_DETECTED** is raised only in service-backed mode (Docker stack / **OPENCOMPLAI_API_URL**), not by the local engine. Optional **--sample-set** runs lexical safety, bias, and data-leakage evaluators on an **EvalSampleSet** JSON whose **system_id** matches the manifest.

Classification in the core engine is deterministic and rule-based. Optional **opencomplai scan --ai-intent** (plugin **opencomplai-ai**) adds a local model pass over extracted callsites. A GitHub/GitLab pre-commit hook and **.ocignore** scan config are supported. Community Edition is **AGPL-3.0**.

# COMMANDS

**init** **--system-id** _id_ **--intended-purpose** _text_ [_options_]

> Write **system-manifest.json** (override with **-o**). **--interactive** runs the applicability checker first. First run also creates **~/.opencomplai/**.

**scan** [**--quick** _path_] [**--manifest** _file_] [**--repo-root** _dir_] [**--fail-on** _none_|_new-major_|_major_|_critical_] [**--output** _human_|_json_] [**--ai-intent**]

> Corroborate the manifest against the tree, or run discovery-only with **--quick** (always exit **0**, no artifact). JSON output is a versioned envelope, not the signed **check** artifact.

**check** [**-m** _manifest_] [**--commit-ref** _ref_] [**--scan-mode** _local_|_ci_|_airgap_] [**--sample-set** _file_] [**--sign**] [**-o** _human_|_json_]

> Full compliance gate. Always writes **compliance-artifact.json** in the current directory.

**checker** [**--web**] [**--local**] [**--answers** _file_] [**-o** _human_|_json_] [**--export-json**|_--export-md_|_--export-pdf_|_--export-all_ _path_] [**--write-manifest** _file_]

> EU AI Act applicability wizard (checker version documented upstream). **--web** opens the hosted docs page; **--web --local** serves an offline copy.

**dashboard**

> Premium dashboard enrollment and sync (Enterprise). See **opencomplai dashboard --help**.

# PARAMETERS

**-m**, **--manifest** _file_

> Manifest path (default **system-manifest.json**) on **scan**/**check**.

**--scan-mode** _local_|_ci_|_airgap_

> How **check** runs. Default **local**.

**--fail-on** _policy_

> **scan** CI gating. Default **none**. Non-empty **scan_errors** fail when this is not **none**.

**--sign** / **--no-sign**

> Sign the **check** artifact with **~/.opencomplai/signing.key**. Default **--no-sign**.

# CONFIGURATION

**~/.opencomplai/**
> Install id, **config.yaml**, and Ed25519 signing key created by **init**.

**.ocignore**
> Per-repo scan limits and ignore rules (bootstrapped on first **scan** unless disabled). Defaults refuse symlinks, cap files at 1 MiB / 20 000 files / 200 MiB total.

**OPENCOMPLAI_API_URL**
> When set, **check** talks to the gateway (service-backed mode) instead of the local engine.

**OPENCOMPLAI_DOCS_URL**
> Override the URL opened by **opencomplai checker --web**.

# CAVEATS

Results are informational, not legal advice; OpenComplAI is not affiliated with the European Union. The scanner treats the manifest as authoritative. **scan --quick** cannot fail a build. **scan --output json** is not the signed **ScanStatusArtifact**. **--ai-intent** needs **opencomplai-ai** and a downloaded local model. Hostile-repo defaults skip symlinks and oversized files.

# SEE ALSO

[pip](/man/pip)(1), [pre-commit](/man/pre-commit)(1)

# RESOURCES

```[Source code](https://github.com/Opencomplai/opencomplai)```

```[Homepage](https://opencomplai.com)```

```[Documentation](https://docs.opencomplai.com)```

<!-- verified: 2026-08-14 -->
