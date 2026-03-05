# TAGLINE

Terminal-based HTTP/REST client with YAML recipes

# TLDR

**Launch the TUI with the default collection**

```slumber```

**Send a request via CLI**

```slumber request --recipe [my_recipe]```

**Import requests from Insomnia**

```slumber import insomnia [export.json]```

# SYNOPSIS

**slumber** [_subcommand_] [_options_]

# DESCRIPTION

**slumber** is a TUI and CLI tool for defining, executing, and sharing HTTP requests. Requests are configured as "recipes" in YAML files, making them easy to version control and share with a team. It supports importing from Insomnia, dynamic request building with templates, and stores request history in a local SQLite database. All data stays local.

# HISTORY

**slumber** was created by **Lucas Pickering** (LucasPickering) and is written in **Rust**.

# SEE ALSO

[curl](/man/curl)(1), [httpie](/man/httpie)(1), [posting](/man/posting)(1)
