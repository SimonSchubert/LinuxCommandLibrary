# TAGLINE

configure GitHub CLI accessibility settings

# TLDR

**Show accessibility guidance and settings**

```gh a11y```

**Open the GitHub Accessibility site in the browser**

```gh a11y --web```

**Enable accessible 4-bit color palette**

```gh config set accessible_colors enabled```

**Enable accessible prompter for screen readers**

```gh config set accessible_prompter enabled```

**Disable motion-based spinners in favor of text indicators**

```gh config set spinner disabled```

# SYNOPSIS

**gh** **a11y** [_flags_]

# PARAMETERS

**-w**, **--web**
> Open the GitHub Accessibility site in the default web browser.

**--help**
> Show help for command.

# DESCRIPTION

**gh a11y** is an alias for **gh accessibility**. It displays guidance on GitHub CLI's accessibility experiences and how to enable them. The command itself only prints guidance; individual features are turned on through **gh config set** or environment variables.

**Accessible colors**: enables a 4-bit ANSI color palette with increased contrast based on the terminal background. Enable with `gh config set accessible_colors enabled` or the `GH_ACCESSIBLE_COLORS` environment variable.

**Label colors**: displays issue and pull request label colors using their custom RGB hex values in true-color terminals. Enable with `gh config set color_labels enabled` or the `GH_COLOR_LABELS` environment variable.

**Accessible prompter**: replaces cursor-manipulating interactive prompts with non-interactive equivalents that work correctly with speech synthesizers and braille displays. Enable with `gh config set accessible_prompter enabled` or the `GH_ACCESSIBLE_PROMPTER` environment variable.

**Text-based spinners**: replaces animated spinner characters with plain text progress indicators. Enable with `gh config set spinner disabled` or the `GH_SPINNER_DISABLED` environment variable.

# CAVEATS

Accessibility features were introduced as a **public preview** in GitHub CLI v2.72.0. This is a built-in core command, not a separately installed extension. Running `gh a11y` alone only displays guidance text.

# HISTORY

GitHub CLI accessibility features were announced in **May 2025** as a public preview, with **gh accessibility** (and its **gh a11y** alias) added to surface the available settings.

# SEE ALSO

[gh-accessibility](/man/gh-accessibility)(1), [gh](/man/gh)(1), [gh-config](/man/gh-config)(1)
