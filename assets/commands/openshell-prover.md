# TAGLINE

Check that an OpenShell policy stays within a boundary

# TLDR

Check a **candidate policy** against a boundary

```openshell-prover check [candidate.yaml] --boundary [boundary.yaml]```

Write the result as **JSON** for scripts

```openshell-prover check [candidate.yaml] --boundary [boundary.yaml] --output json```

Give the solver more than the default **10 seconds**

```openshell-prover check [candidate.yaml] --boundary [boundary.yaml] --timeout [30s]```

Save a sandbox's **effective policy** and check it

```openshell sandbox get [my-sandbox] --policy-only > [candidate.yaml]```

```openshell-prover check [candidate.yaml] --boundary [boundary.yaml]```

# SYNOPSIS

**openshell-prover** **check** _candidate_ **--boundary** _FILE_ [**-o** _text_|_json_] [**--timeout** _DURATION_]

# DESCRIPTION

**openshell-prover** is the standalone OpenShell policy boundary checker. It reads two YAML policy files on disk, encodes the supported parts as an SMT model, and reports whether the candidate allows any access the boundary does not. It does not talk to a gateway, fetch sandbox state, or apply policy.

The check covers filesystem access, process identity, Landlock settings, network connections, and REST requests. If a policy uses something else (GraphQL, MCP, WebSocket, JSON-RPC, and similar), the prover reports that it cannot check the policy instead of ignoring those rules.

A passing result means the candidate stays within the boundary in the modeled domains. It does not mean the policy is as narrow as it could be, that it is safe for a particular task, or that a running sandbox enforces it. Proposal-risk checks (cloud metadata, new credentialed destinations) run inside the gateway's policy advisor and are a different question.

The crate **openshell-prover-cli** builds this binary. Desktop packages ship it next to **openshell**. On snap the app is **openshell.prover**; the **openshell-prover** alias needs Snap Store approval and may be missing.

# PARAMETERS

**check** _candidate_ **--boundary** _FILE_

> Compare a fully composed candidate policy with an operator-owned boundary. Both paths must be regular files, UTF-8, and at most **4 MiB**.

**-o** _FORMAT_, **--output** _FORMAT_

> **text** (default) or **json**. JSON uses **schema_version** for the result contract and **prover_version** for the implementation. Read **result** and **reason_code**; also check **coverage.domains**.

**--timeout** _DURATION_

> Solver budget: an integer followed by **ms**, **s**, or **m** (default **10s**).

**-V**, **--version**

> Print the version.

With no subcommand the binary prints help and exits **0**.

# CONFIGURATION

There is no prover config file. Both inputs are authored OpenShell policy YAML (**version: 1**). The boundary is usually the most access an environment allows. The candidate should be the complete effective policy, including network rules that attached providers add; the prover does not add provider rules itself.

A minimal boundary that allows reading **/usr** and **/etc**:

```
version: 1
filesystem_policy:
  read_only:
    - /usr
    - /etc
```

# CAVEATS

Exit codes: **0** **within_boundary**, **1** **exceeds_boundary**, **2** usage or invalid input, **3** **unsupported** or **inconclusive**, **130** interrupted with Ctrl-C on Unix. Only **0** is a pass.

Comparing different filesystem paths returns **unsupported**, even when one path sits under the other, because a symlink in the sandbox image could point outside the boundary path. A boundary entry for **/** covers every path. Very large policies (for example more than **1,024** network rules or **4,096** endpoints across both files) return **inconclusive** with **reason_code** **resource_limit**.

The prover does not resolve hostnames. An exact binary path under a boundary glob, mixed **allowed_ips** on overlapping hosts, audit-mode REST endpoints, and non-ASCII host/path/method/binary literals are **unsupported**.

# HISTORY

The OpenShell Policy Prover landed in the NVIDIA OpenShell tree in **2026** as a Z3-backed checker for sandbox policies. The standalone **openshell-prover** binary is the file-oriented boundary check; the gateway still runs proposal-risk queries on agent-authored network rules.

# INSTALL

```aur: yay -S openshell```

```brew: brew install openshell```

```nix: nix profile install nixpkgs#openshell```

<!-- packages: 2026-10-22 -->

# SEE ALSO

[openshell](/man/openshell)(1), [openshell-gateway](/man/openshell-gateway)(1), [openshell-driver-vm](/man/openshell-driver-vm)(1)

# RESOURCES

```[Source code](https://github.com/NVIDIA/OpenShell)```

```[Homepage](https://www.nvidia.com/en-us/ai/openshell/)```

```[Documentation](https://docs.nvidia.com/openshell/latest/how-it-works/policies/prover)```

<!-- verified: 2026-10-23 -->
