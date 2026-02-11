# TAGLINE

Insert text editor into pipelines

# TLDR

**Edit pipe content**

```echo "text" | vipe```

**Edit command output**

```cat [file.txt] | vipe | [next_command]```

**Edit with specific editor**

```EDITOR=[vim] cat [file.txt] | vipe```

**Transform data interactively**

```echo '{"key": "value"}' | vipe | jq .```

# SYNOPSIS

**vipe** < _stdin_ > _stdout_

# ENVIRONMENT

**EDITOR** - Editor to use
**VISUAL** - Visual editor

# DESCRIPTION

**vipe** inserts a text editor into a Unix pipeline. It reads standard input into a temporary file, opens it in the editor specified by the EDITOR or VISUAL environment variable, and writes the edited content to standard output when the editor exits.

This allows interactive modification of data flowing through a pipeline, which is useful for manually fixing input before it reaches the next command, debugging pipeline data, or performing one-off transformations that are easier to do in an editor than with sed or awk.

# EXAMPLE

```
$ seq 5 | vipe | sort -r
# Editor opens with:
# 1
# 2
# 3
# 4
# 5
# Make edits, save, quit
# Output continues through sort
```

# CAVEATS

Part of moreutils package. Breaks non-interactive pipelines. Editor must be terminal-based.

# HISTORY

**vipe** is part of **moreutils** by **Joey Hess**. It enables interactive editing within Unix pipelines.

# SEE ALSO

[vidir](/man/vidir)(1), [sponge](/man/sponge)(1), [tee](/man/tee)(1)
