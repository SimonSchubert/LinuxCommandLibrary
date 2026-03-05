# TAGLINE

Get the byte size of strings, URLs, and files

# TLDR

**Get the byte size of a string**

```sizeof "[hello world]"```

**Get the size of a webpage**

```sizeof "[https://example.com]"```

**Get the size of a local file**

```sizeof [/path/to/file.html]```

# SYNOPSIS

**sizeof** _input_

# DESCRIPTION

**sizeof** is a command-line tool that tells you the size of strings, URLs, and files in bytes and human-readable terms. You pass it arbitrary strings, URLs, or file paths and it returns a breakdown of the size.

# HISTORY

**sizeof** was created by **Zachary Proser** (zackproser) and is written in **Go**.

# SEE ALSO

[wc](/man/wc)(1), [du](/man/du)(1), [stat](/man/stat)(1)
