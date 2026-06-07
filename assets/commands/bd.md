# TAGLINE

Navigate to parent directories by name

# TLDR

**Go back** to a parent directory by name (or its first few letters)

```bd [name]```

**Case-sensitive** match

```bd -s [name]```

**Run a command** in a parent directory without changing to it

```ls `bd [name]` ```

# SYNOPSIS

**bd** [_-si_] _name_

# DESCRIPTION

**bd** (back directory) is a bash utility for quickly navigating to a parent directory by name instead of typing multiple `cd ../../../` commands. It searches upward in the current path for a directory whose name matches (matching on the first few letters is enough).

If several ancestors share the same name, bd jumps to the closest one (the immediate parent is not considered a match). It is installed as a shell alias so the directory change persists in your shell:

```alias bd=". bd -si"```

# PARAMETERS

**-s**
> Case-sensitive matching (the default alias uses **-si** for case-insensitive).

**-i**
> Case-insensitive matching (no-op when already the default).

# WORKFLOW

```bash
# Current path: /home/user/projects/myapp/src/components
# Jump up to 'myapp'
bd myapp
# Now in: /home/user/projects/myapp

# Or just the first letters
bd my

# Use a parent path inline without leaving the current directory
cp file.txt `bd projects`
```

# FEATURES

- Prefix matching on parent directory names
- Bash completion support (via the bundled completion file)
- Closest-match resolution when names repeat in the path

# CAVEATS

Requires installation and an alias in your shell config (the alias sources the script so the `cd` sticks). Only walks upward through the current path, not into sibling trees. Built for bash; separate ports exist for zsh and fish. Not available by default on most systems.

# HISTORY

**bd** was created by Vigneshwaran Raveendran (vigneshwaranr) to simplify navigating up directory trees by name.

# SEE ALSO

[cd](/man/cd)(1), [pushd](/man/pushd)(1), [z](/man/z)(1)
