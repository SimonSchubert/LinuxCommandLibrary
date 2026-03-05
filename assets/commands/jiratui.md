# TAGLINE

TUI for interacting with Atlassian Jira

# TLDR

**Launch jiratui**

```jiratui```

# SYNOPSIS

**jiratui** [_options_]

# DESCRIPTION

**jiratui** is a Text User Interface for interacting with **Atlassian Jira** directly from the terminal. Built using the **Textual** and **Rich** frameworks, it supports the Jira Cloud Platform REST API v3. The interface provides search functionality with **JQL** (Jira Query Language) support, task management, comment management, and issue linking.

Key features include viewing and editing issues, managing comments, linking and unlinking related tasks, and performing advanced searches with complex JQL queries.

# CONFIGURATION

Configuration is stored in **$HOME/.config/jiratui/config.yaml** or can be set via the **JIRA_TUI_CONFIG_FILE** environment variable. Settings include Jira server URL, authentication credentials, and default project.

# CAVEATS

Requires a Jira Cloud account and API token. Jira Server/Data Center support may be limited. Some advanced Jira features may not be available in the TUI.

# HISTORY

**jiratui** was created by **whyisdifficult** and is written in **Python** using the Textual framework. It was designed to provide a keyboard-driven Jira experience for developers who prefer to work in the terminal.

# SEE ALSO

[jira-cli](/man/jira-cli)(1)
