# TAGLINE

Removed from util-linux, use tail -f

# TLDR

Follow a file, replacing **tailf**

```tail -f [path/to/file]```

Show the last **20** lines and follow

```tail -n [20] -f [path/to/file]```

# DESCRIPTION

**tailf** followed the growth of a log file like **tail -f**, but did not access the file while it was not growing, which avoided disk spin-ups on laptops. Its **-n** option set the number of initial lines.

This command has been superseded by [tail](/man/tail) -f.

# HISTORY

**tailf** was part of **util-linux**. It was deprecated and then removed in util-linux **2.30**, which recommends **tail -f** from coreutils instead.

# SEE ALSO

[tail](/man/tail)(1), [less](/man/less)(1)

# RESOURCES

```[Source code](https://github.com/util-linux/util-linux)```

<!-- verified: 2026-11-09 -->
