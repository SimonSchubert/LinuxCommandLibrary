# TAGLINE

GitHub CLI help topic for MinTTY terminal compatibility on Windows

# TLDR

**Show MinTTY compatibility help**

```gh help mintty```

**Work around MinTTY input issues** using winpty (may cause UI bugs)

```winpty gh auth login```

# SYNOPSIS

**gh help mintty**

# DESCRIPTION

**gh-mintty** is a help topic in the GitHub CLI describing known compatibility issues between **gh** and MinTTY, the default terminal emulator shipped with Git for Windows. MinTTY lacks proper pseudo-console support, which breaks **gh**'s interactive prompts.

Three workarounds exist:

1. Reinstall Git for Windows with "Enable experimental support for pseudo consoles" checked.
2. Run `C:\Program Files\Git\bin\bash.exe` from a different terminal emulator (e.g. Windows Terminal), which provides access to Git for Windows tools without MinTTY.
3. Prefix **gh** commands with `winpty` (e.g. `winpty gh auth login`), though this can cause UI rendering bugs.

# CAVEATS

Windows-specific topic. The `winpty` workaround may cause UI bugs. The experimental pseudo-console option in Git for Windows is the most complete fix.

# SEE ALSO

[gh](/man/gh)(1), [gh-help](/man/gh-help)(1), [gh-config](/man/gh-config)(1)
