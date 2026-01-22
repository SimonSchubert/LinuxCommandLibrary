# TLDR

**Run accessibility audit**

```gh a11y audit [url]```

**Audit current repository**

```gh a11y audit```

**Generate report**

```gh a11y audit --output [report.json]```

**Check specific page**

```gh a11y audit [url] --rules [wcag2a]```

# SYNOPSIS

**gh a11y** _command_ [_options_]

# PARAMETERS

**audit**
> Run accessibility audit on a URL or repository.

**--output** _FILE_
> Output file for report.

**--rules** _RULESET_
> WCAG ruleset to apply (wcag2a, wcag2aa).

**--format** _FORMAT_
> Output format (json, csv, html).

**--help**
> Display help information.

# DESCRIPTION

**gh a11y** is a GitHub CLI extension for accessibility testing. It analyzes web pages and applications for WCAG compliance, identifying accessibility issues that may affect users with disabilities.

The extension integrates with GitHub workflows, allowing accessibility checks to be part of pull request reviews and CI/CD pipelines. It generates reports in various formats for documentation and tracking.

gh a11y helps teams maintain accessible web applications throughout development.

# CAVEATS

Extension must be installed via **gh extension install**. Results are automated checks; manual testing also recommended.

# HISTORY

gh a11y is a community **GitHub CLI extension** that brings accessibility testing to the gh ecosystem, building on web accessibility standards and tooling.

# SEE ALSO

[gh](/man/gh)(1), [gh-extension](/man/gh-extension)(1)
