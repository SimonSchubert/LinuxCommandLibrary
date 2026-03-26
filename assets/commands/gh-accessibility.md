# TAGLINE

manage accessibility settings for GitHub CLI

# TLDR

**Show accessibility guidance and settings**

```gh accessibility```

**Open the GitHub Accessibility site in the browser**

```gh accessibility --web```

**Enable accessible 4-bit color palette**

```gh config set accessible_colors enabled```

**Enable accessible prompter for screen readers**

```gh config set accessible_prompter enabled```

**Disable motion-based spinners in favor of text indicators**

```gh config set spinner disabled```

# SYNOPSIS

**gh** **accessibility** [_flags_]

# PARAMETERS

**-w**, **--web**
> Open the GitHub Accessibility site in the default web browser.

**--help**
> Show help for command.

# DESCRIPTION

**gh accessibility** displays guidance on GitHub CLI's accessibility experiences and how to enable them. It is aliased as **gh a11y**.

The command describes four areas of accessibility support:

**Accessible colors** — enables a 4-bit ANSI color palette with increased contrast based on terminal background (dark or light). This allows users to customize colors through their terminal preferences. Enable with `gh config set accessible_colors enabled` or the `GH_ACCESSIBLE_COLORS` environment variable.

**Label colors** — displays issue and pull request label colors using their custom RGB hex values in terminals with true color support. Enable with `gh config set color_labels enabled` or the `GH_COLOR_LABELS` environment variable.

**Accessible prompter** — replaces cursor-manipulating interactive prompts with non-interactive equivalents that work correctly with speech synthesizers and braille displays. Enable with `gh config set accessible_prompter enabled` or the `GH_ACCESSIBLE_PROMPTER` environment variable.

**Text-based spinners** — replaces animated spinner characters with plain text progress indicators, removing motion that may cause discomfort or be misread by screen readers. Enable with `gh config set spinner disabled` or the `GH_SPINNER_DISABLED` environment variable.

# CAVEATS

Accessibility features were introduced as a **public preview** in GitHub CLI v2.72.0. Individual features must be enabled explicitly via `gh config set` or environment variables; running `gh accessibility` alone only displays the guidance text.

# SEE ALSO

[gh](/man/gh)(1), [gh-config](/man/gh-config)(1), [gh-environment](/man/gh-environment)(1)
