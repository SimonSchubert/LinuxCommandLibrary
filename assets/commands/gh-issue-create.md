# TAGLINE

create new GitHub issues with metadata

# TLDR

**Create issue interactively**

```gh issue create```

**Create with title and body**

```gh issue create -t "[title]" -b "[body]"```

**Create with labels**

```gh issue create -t "[title]" -l [bug] -l [urgent]```

**Create and assign**

```gh issue create -t "[title]" -a [username]```

**Create from template**

```gh issue create --template [bug_report.md]```

**Create in specific repo**

```gh issue create -R [owner/repo] -t "[title]"```

# SYNOPSIS

**gh** **issue** **create** [_options_]

# PARAMETERS

**-t**, **--title** _title_
> Issue title.

**-b**, **--body** _body_
> Issue body.

**-l**, **--label** _label_
> Add labels.

**-a**, **--assignee** _user_
> Assign users.

**-m**, **--milestone** _name_
> Set milestone.

**-p**, **--project** _name_
> Add to project.

**--template** _file_
> Use template.

**-R**, **--repo** _owner/repo_
> Repository.

**-w**, **--web**
> Open in browser.

# DESCRIPTION

**gh issue create** creates a new GitHub issue with comprehensive metadata support. Issues can be created interactively with prompts or non-interactively with command-line flags for automation.

The command supports issue templates, which provide structured formats for bug reports, feature requests, or custom issue types. Templates ensure consistent information gathering. Labels categorize issues, assignees designate responsible parties, and milestones group related work.

Issues can be added directly to GitHub Projects and opened in a browser for immediate editing. The --web flag launches the browser-based creation form when more complex formatting is needed.

# SEE ALSO

[gh-issue](/man/gh-issue)(1), [gh-issue-list](/man/gh-issue-list)(1)

