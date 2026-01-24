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

**vipe** inserts an editor into a pipeline. It captures stdin, opens editor, outputs result.

Data flows into editor. Make changes interactively.

Save and quit sends to stdout. Continue pipeline processing.

Useful for manual transformation. Fix data before processing.

Debug pipelines interactively. Inspect and modify mid-stream.

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
