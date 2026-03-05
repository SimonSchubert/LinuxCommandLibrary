# TAGLINE

Interactive grep for streaming data

# TLDR

**Filter streaming Kubernetes logs interactively**

```stern --context kind etcd |& sig```

**Re-execute and filter a command**

```sig --cmd "[stern --context kind etcd]"```

**Interactively search a static file**

```cat [README.md] |& sig```

# SYNOPSIS

**sig** [_options_]

# DESCRIPTION

**sig** is an interactive grep tool that filters streaming data in real-time. It works well with piped output such as Kubernetes logs or WebSocket data. It includes an archived mode that buffers recent entries for backward searching, and supports both streaming and static file input.

# HISTORY

**sig** was created by **ynqa** and is written in **Rust**.

# SEE ALSO

[grep](/man/grep)(1), [ripgrep](/man/ripgrep)(1), [fzf](/man/fzf)(1)
