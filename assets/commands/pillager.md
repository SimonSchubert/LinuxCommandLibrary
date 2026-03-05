# TAGLINE

Pillage filesystems for sensitive information

# TLDR

**Scan the current directory for secrets**

```pillager hunt .```

**Launch the interactive TUI scanner**

```pillager```

# SYNOPSIS

**pillager** [_command_] [_options_] [_path_]

# DESCRIPTION

**pillager** is a filesystem scanner that recursively searches directories for sensitive information such as API keys, passwords, and credentials. It uses concurrent workers for fast scanning and implements Gitleaks rules for pattern matching. Discovered secrets can be sent to remote destinations including S3/MinIO, webhooks, or Sliver C2 loot stores.

# CAVEATS

Intended for defensive, educational, and authorized security research use only.

# HISTORY

**pillager** was created by **Britton Hayes** (brittonhayes) and is written in **Go**.

# SEE ALSO

[gitleaks](/man/gitleaks)(1), [trufflehog](/man/trufflehog)(1), [grep](/man/grep)(1)
