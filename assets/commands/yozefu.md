# TAGLINE

TUI application for exploring Kafka cluster data

# TLDR

**Launch the Kafka explorer TUI**

```yozefu```

**Run in headless CLI mode**

```yozefu --headless --topic [my-topic]```

**Connect to a specific cluster**

```yozefu --cluster [my-cluster]```

# SYNOPSIS

**yozefu** [_options_]

# DESCRIPTION

**yozefu** is an interactive terminal application for browsing and searching data in Kafka clusters. It features a SQL-inspired query language for filtering records, a headless mode for shell scripts, WebAssembly-based user-defined filtering functions, and a ring buffer storing the last 500 records.

# HISTORY

**yozefu** was created by **Yann Prono** (MAIF) and is written in **Rust**.

# SEE ALSO

[kafkacat](/man/kafkacat)(1)
