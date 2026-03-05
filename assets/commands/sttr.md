# TAGLINE

Cross-platform CLI for 50+ string transformations

# TLDR

**Generate an MD5 hash of a string**

```sttr md5 "[Hello World]"```

**Base64 encode piped input**

```echo "Hello" | sttr base64-encode```

**Convert a YAML file to JSON**

```sttr yaml-json [file.yaml]```

# SYNOPSIS

**sttr** _operation_ [_input_]

# DESCRIPTION

**sttr** is a cross-platform command-line application for performing various transformation operations on strings. It supports encoding/decoding (base64, URL), hashing (MD5, SHA), case conversion, JSON/YAML conversion, and many more. It features both an interactive TUI mode and a scriptable CLI interface.

# HISTORY

**sttr** was created by **abhimanyu003** and is written in **Go**.

# SEE ALSO

[jq](/man/jq)(1), [base64](/man/base64)(1), [openssl](/man/openssl)(1)
