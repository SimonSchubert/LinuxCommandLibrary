# TAGLINE

opens Jira issues or projects in the default web browser

# TLDR

**Open issue in browser**

```jira open [PROJ-123]```

**Open the configured project page**

```jira open```

**Open a different project**

```jira open -p [PROJECT]```

**Print the URL only** without launching a browser

```jira open [PROJ-123] --no-browser```

# SYNOPSIS

**jira open** [_issue_] [_options_]

# PARAMETERS

_ISSUE_
> Issue key to open; a bare number is prefixed with the project key.

**-n**, **--no-browser**
> Print the destination URL without opening the browser.

**-p**, **--project** _PROJECT_
> Project to use instead of the configured one.

**-c**, **--config** _FILE_
> Use an alternative config file.

**--help**
> Display help information.

# DESCRIPTION

**jira open** opens a Jira issue, or the project page when no key is given, in the default web browser. It builds a **/browse/** URL from the configured server (or **browse_server** if set) and always prints it. **jira browse** and **jira navigate** are aliases.

# CAVEATS

Subcommand of **jira-cli** (ankitpokhrel/jira-cli). Requires a configured server (**jira init**). There are no options to open boards, sprints or backlogs.

# SEE ALSO

[jira](/man/jira)(1), [jira-browse](/man/jira-browse)(1), [jira-issue](/man/jira-issue)(1), [xdg-open](/man/xdg-open)(1), [open](/man/open)(1)

# RESOURCES

```[Source code](https://github.com/ankitpokhrel/jira-cli)```

```[Documentation](https://github.com/ankitpokhrel/jira-cli/wiki)```

<!-- verified: 2026-09-29 -->
