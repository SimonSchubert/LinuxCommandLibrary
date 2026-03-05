# TAGLINE

Interactive TUI for finding and killing processes

# TLDR

**Launch the interactive process picker**

```pik```

**Filter processes by name**

```pik [process_name]```

# SYNOPSIS

**pik** [_options_] [_pattern_]

# DESCRIPTION

**pik** (Process Interactive Kill) is a terminal tool for interactively finding and killing processes. It works like **pkill** but with a live, interactive search interface where you type to filter processes and select which to kill. It supports prefix search for arguments and ports, configurable readline-style key mappings, and cross-platform operation.

# HISTORY

**pik** was created by **Jacek Kurlit** (jacek-kurlit) and is written in **Rust**.

# SEE ALSO

[pkill](/man/pkill)(1), [kill](/man/kill)(1), [htop](/man/htop)(1), [procs](/man/procs)(1)
