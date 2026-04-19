# TAGLINE

Agentless SSH-based DevOps command center for Linux infrastructure

# TLDR

**Install Deflect One** from PyPI

```pip install deflect-one```

**Start the dashboard** in production mode

```deflect```

**Launch demo mode** (no SSH connections required)

```deflect --demo```

**Run directly from a checkout** with manual dependencies

```pip install textual paramiko cryptography && python deflect.py```

**Open the AI chat** inside the running TUI to run natural-language commands

```[Ctrl+A]```

**Pop an interactive SSH shell** on the selected host

```[F2]```

# SYNOPSIS

**deflect** [_options_]

# PARAMETERS

**--demo**
> Run in demonstration mode without any SSH access. Useful for evaluation or training.

**-h**, **--help**
> Print usage information and exit.

# KEYBOARD SHORTCUTS

**Ctrl+D**
> Docker management panel.

**Ctrl+W**
> Firewall (UFW / iptables) overview.

**Ctrl+F**
> SFTP file manager.

**Ctrl+A**
> AI chat — describe an intent in plain English and have it translated to CLI / SSH / Bash commands.

**Ctrl+L**
> Log aggregation view.

**Ctrl+P**
> Process monitor.

**F1**
> Help menu.

**F2**
> Interactive SSH shell on the selected host.

# DESCRIPTION

**Deflect One** (command **deflect**) is a single-file Python TUI that turns SSH access into a full DevOps platform. It combines **observability** (CPU/memory/disk, process tables, log aggregation), **security** (active attack detection, firewall control), and **operations** (Docker management, package installs, SFTP, deployments) into one interface, with no agent to install on the managed hosts. Only SSH credentials are required.

An optional LLM backend powers the **Ctrl+A** chat: an operator can type _"restart nginx on web-prod-02 and tail its error log"_ and Deflect One generates and executes the matching commands, showing the output inline. The tool is built with the **Textual** framework and uses **paramiko** for SSH and **cryptography** for key handling.

# CONFIGURATION

Hosts, credentials, and optional AI-provider keys are stored in a local config file created on first run; all SSH traffic is made directly from the workstation running Deflect One, so nothing is routed through a vendor cloud.

# CAVEATS

Because Deflect One executes arbitrary remote commands on your behalf — including AI-generated ones — treat the **Ctrl+A** flow with the same caution as giving an agent shell access: review each command before confirming, especially on production hosts. The project is licensed MIT **with attribution requirements**; read the LICENSE before redistributing.

# HISTORY

**Deflect One** is written by **Volodymyr Frytskyy (WhitemanV)** as a lightweight alternative to heavyweight commercial DevOps suites, keeping infrastructure management agentless and self-contained.

# SEE ALSO

[ssh](/man/ssh)(1), [ansible](/man/ansible)(1), [htop](/man/htop)(1), [tmux](/man/tmux)(1), [lazydocker](/man/lazydocker)(1)
