# TAGLINE

Write Linux pipes interactively with live preview

# TLDR

**Interactively build a pipeline from command output**

```lshw |& up```

**Process CSV data interactively**

```cat [data.csv] | up```

# SYNOPSIS

_command_ | **up**

# DESCRIPTION

**up** (Ultimate Plumber) lets you build complex shell pipelines interactively by showing instant live preview of command results as you type. The pipeline is passed to bash, so all bash features work. Press **Ctrl-X** to save the final pipeline to a script file. The input buffer is capped at 40 MB.

# HISTORY

**up** was created by **Mateusz Czaplinski** (akavel) and is written in **Go**.

# SEE ALSO

[watch](/man/watch)(1), [fzf](/man/fzf)(1), [pv](/man/pv)(1)
