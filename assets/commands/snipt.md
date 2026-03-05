# TAGLINE

Text snippet expansion tool for your terminal

# TLDR

**Start the background daemon**

```snipt start```

**Add a new snippet**

```snipt add --shortcut [email] --snippet "[user@example.com]"```

**Display all saved snippets**

```snipt list```

# SYNOPSIS

**snipt** _command_ [_options_]

# DESCRIPTION

**snipt** is a system-wide text snippet expansion tool that runs as a background daemon monitoring keyboard input. You type a prefix character followed by a shortcut and snipt automatically expands it into predefined text. It supports clipboard integration, script execution with the **!** prefix, parameterized snippets, and text transformations.

# HISTORY

**snipt** was created by the **snipt** organization and is written in **Rust**.

# SEE ALSO

[espanso](/man/espanso)(1), [pet](/man/pet)(1), [nap](/man/nap)(1)
