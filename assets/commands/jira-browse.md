# TAGLINE

opens a Jira issue or project in your default web browser

# TLDR

**Open issue in browser**

```jira browse [ISSUE-123]```

**Open an issue by number** in the configured project

```jira browse [123]```

**Open the configured project page**

```jira browse```

**Open a specific project**

```jira browse -p [PROJECT]```

**Print the URL** without opening a browser

```jira browse [ISSUE-123] -n```

# SYNOPSIS

**jira** **browse** [_issue-key_] [_options_]

# PARAMETERS

_ISSUE-KEY_
> Issue key; a bare number is prefixed with the project key.

**-n**, **--no-browser**
> Only print the URL, don't open the browser.

**-p**, **--project** _key_
> Specify project key.

# DESCRIPTION

**jira browse** is an alias of **jira open** in **jira-cli** (ankitpokhrel/jira-cli). It opens a Jira issue, or the project page when no key is given, in your default web browser and prints the URL. **jira navigate** is another alias.

# SEE ALSO

[jira](/man/jira)(1), [jira-open](/man/jira-open)(1), [jira-issue](/man/jira-issue)(1)

# RESOURCES

```[Source code](https://github.com/ankitpokhrel/jira-cli)```

```[Documentation](https://github.com/ankitpokhrel/jira-cli/wiki)```

<!-- verified: 2026-09-29 -->
