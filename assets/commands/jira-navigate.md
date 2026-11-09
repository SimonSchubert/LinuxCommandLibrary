# TAGLINE

Open a Jira issue or project in your web browser

# TLDR

**Open the current project page**

```jira navigate```

**Open a specific issue**

```jira navigate [ISSUE-1]```

**Open the page of another project**

```jira navigate -p [PROJECT_KEY]```

**Print the URL without opening a browser**

```jira navigate [ISSUE-1] --no-browser```

# SYNOPSIS

**jira** **navigate** [_ISSUE-KEY_] [_options_]

# PARAMETERS

_ISSUE-KEY_
> Issue to open, for example ISSUE-1. Without it, the project page opens.

**-n**, **--no-browser**
> Print the destination URL but skip opening it in the browser.

**-p**, **--project** _key_
> Jira project to look into. Defaults to the project in your jira-cli configuration.

**-c**, **--config** _file_
> Config file to use.

**--debug**
> Turn on debug output.

# DESCRIPTION

**jira navigate** is an alias of **jira open** (also available as **jira browse**) from **jira-cli** by Ankit Pokhrel. It opens an issue, or the project page when no key is given, in your default web browser and prints the URL it opens. The **browse_server** configuration setting can override the host used in the URL.

# CAVEATS

The command only opens issue and project pages. There are no dedicated flags for boards or backlogs; use **jira sprint** or **jira board** to work with those in the terminal.

# SEE ALSO

[jira](/man/jira)(1), [jira-open](/man/jira-open)(1), [jira-issue](/man/jira-issue)(1), [jira-sprint](/man/jira-sprint)(1), [jira-project](/man/jira-project)(1)

# RESOURCES

```[Source code](https://github.com/ankitpokhrel/jira-cli)```

<!-- verified: 2026-11-09 -->
