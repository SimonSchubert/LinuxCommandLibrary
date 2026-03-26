# TAGLINE

Linter for English prose style

# TLDR

**Check a text file**

```proselint [document.txt]```

**Check multiple files**

```proselint [*.md]```

**Output as JSON**

```proselint --json [document.txt]```

**Show version**

```proselint --version```

**Check from stdin**

```cat [document.txt] | proselint```

**Clear the cache**

```proselint --clean```

# SYNOPSIS

**proselint** [_options_] _files_...

# DESCRIPTION

**proselint** is a linter for English prose. It checks for writing issues like clichés, jargon, redundancy, and common errors, helping improve clarity and style.

The tool draws on advice from style guides and editorial best practices, providing actionable suggestions for better writing.

# PARAMETERS

**-j**, **--json**
> Output in JSON format.

**--config** _file_
> Path to configuration file.

**--compact**
> Compact output format.

**-d**, **--debug**
> Give verbose output.

**-c**, **--clean**
> Clear the cache.

**--demo**
> Run over built-in demo file.

**--dump-config**
> Print current configuration.

**--dump-default-config**
> Print default configuration.

**-v**, **--version**
> Show version.

**--help**
> Show help.

# CHECKS

Clichés, jargon, weasel words, redundancy, sexism, consistency, typography, hedging, archaisms, mixed metaphors, and more.

# CONFIGURATION

**~/.config/proselint/config.json**
> JSON configuration file to enable or disable specific checks using a hierarchical check-selection system for categories like cliches, jargon, redundancy, and typography.

# CAVEATS

Style suggestions subjective. May flag intentional usage. English only. Some checks may not apply to all contexts.

# HISTORY

**proselint** was created by **Amperser Labs** to bring code linting concepts to prose. It aggregates wisdom from editorial style guides into an automated checking tool, useful for writers, documentation, and content review.

# SEE ALSO

[vale](/man/vale)(1), [write-good](/man/write-good)(1), [aspell](/man/aspell)(1), [textlint](/man/textlint)(1), [hunspell](/man/hunspell)(1)
