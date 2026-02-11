# TAGLINE

English prose linter for documentation

# TLDR

**Check a file** for prose issues

```write-good [path/to/file.md]```

**Check multiple files** using glob pattern

```write-good [**/*.md]```

**Check inline text**

```write-good --text="[It should have been defined there.]"```

**Disable passive voice check**

```write-good --no-passive [path/to/file.md]```

**Disable adverb warnings**

```write-good --no-adverb [path/to/file.md]```

**Only check for specific issues**

```write-good --passive --adverb [path/to/file.md]```

**Parse text from stdin**

```echo "[The file was written by him.]" | write-good```

# SYNOPSIS

**write-good** [**--text**=_string_] [**--no-**_check_] [_file_|_glob_...]

# PARAMETERS

**--text**=_string_
> Analyze the provided text string instead of files.

**--no-passive**
> Disable passive voice detection.

**--no-adverb**
> Disable adverb warnings (really, extremely, etc.).

**--no-illusion**
> Disable lexical illusion detection (repeated words).

**--no-so**
> Disable warnings for sentences starting with "so".

**--no-thereIs**
> Disable warnings for "there is/are" at sentence start.

**--no-weasel**
> Disable weasel word detection.

**--no-tooWordy**
> Disable wordy phrase detection.

**--no-cliches**
> Disable cliche detection.

**--no-eprime**
> Disable E-Prime checking (forms of "to be").

**--parse**
> Parse text from stdin.

# DESCRIPTION

**write-good** is a linter for English prose that helps identify common writing issues. It flags passive voice, unnecessary adverbs, weasel words, cliches, lexical illusions (repeated words), and wordy phrases.

The tool is designed for developers writing documentation, README files, and technical content. It can analyze individual files, multiple files via glob patterns, or inline text strings.

Each suggestion includes the problematic text, its position in the file, and a reason explaining the issue. Checks can be selectively disabled using **--no-** flags, or enabled individually by specifying only the desired checks.

write-good integrates with editors through plugins for Vim (via ALE), Sublime Text, VS Code, and others. It can also run in Docker containers for CI/CD pipelines.

# CAVEATS

The linter is intentionally "naive" and may flag false positives. Passive voice and adverbs are not always wrong; use judgment when reviewing suggestions. The tool focuses on common issues and is not a comprehensive grammar checker. Some technical writing may legitimately require passive construction.

# HISTORY

**write-good** was created by **Brian Ford** (btford) and first released around **2014**. The project name is a reference to the movie Zoolander. It has become a popular tool in the JavaScript community for improving documentation quality and is used in CI pipelines for open-source projects.

# SEE ALSO

[vale](/man/vale)(1), [proselint](/man/proselint)(1), [grammarly](/man/grammarly)(1), [aspell](/man/aspell)(1)
