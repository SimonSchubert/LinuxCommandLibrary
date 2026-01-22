# TLDR

**List** outdated processes

```needrestart```

**Interactively restart** services

```sudo needrestart```

List in **verbose** mode

```needrestart -v```

List in **quiet** mode

```needrestart -q```

Check if **kernel** is outdated

```needrestart -k```

Check if **CPU microcode** is outdated

```needrestart -w```

List in **batch** mode (non-interactive)

```needrestart -b```

Use specific **configuration file**

```needrestart -c [path/to/config]```

# SYNOPSIS

**needrestart** [**-v**|**-q**] [**-k**] [**-w**] [**-b**] [**-c** _config_]

# PARAMETERS

**-v**
> Verbose mode; show more details

**-q**
> Quiet mode; suppress output

**-k**
> Check if running kernel is outdated

**-w**
> Check if CPU microcode is outdated

**-b**
> Batch mode; non-interactive, suitable for scripts

**-l**
> List only; do not prompt for restart

**-r _mode_**
> Restart mode: i (interactive), a (automatic), l (list only)

**-c _config_**
> Use specified configuration file

**-p**
> Enable nagios plugin mode output

**-f _frontend_**
> Select frontend: debconf, stdio, readline

# DESCRIPTION

**needrestart** checks which daemons need to be restarted after library upgrades. When shared libraries are updated, running processes may still use old versions in memory, potentially leaving security vulnerabilities unpatched.

The tool scans running processes for deleted library files (indicating updates) and identifies services that should be restarted. It can also check for outdated kernels and CPU microcode requiring a reboot.

# CAVEATS

Restarting services may cause brief outages. Kernel and microcode updates require a full reboot. Some processes may be difficult to identify or restart. Running with sudo enables interactive restart prompts.

# HISTORY

**needrestart** was developed by **Thomas Liske** for Debian-based systems to help administrators identify services needing restart after package updates. It integrates with apt to run automatically after upgrades.

# SEE ALSO

[systemctl](/man/systemctl)(1), [apt](/man/apt)(8), [checkrestart](/man/checkrestart)(1)
