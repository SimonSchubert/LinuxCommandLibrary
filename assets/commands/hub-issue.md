# TAGLINE

manages GitHub issues from the command line

# TLDR

**List open issues**

```hub issue```

**List issues with a label**

```hub issue -l [bug]```

**Create a new issue** (opens an editor)

```hub issue create```

**Create with title and body**

```hub issue create -m "[title]" -m "[body]"```

**Show a specific issue**

```hub issue show [123]```

**List an assignee's issues**

```hub issue -a [username]```

# SYNOPSIS

**hub issue** [_-a_ _assignee_] [_-c_ _creator_] [_-@_ _user_] [_-s_ _state_] [_-f_ _format_] [_-M_ _milestone_] [_-l_ _labels_] [_-L_ _limit_]

**hub issue show** [_-f_ _format_] _number_

**hub issue create** [**-o**] [**-m** _message_ | **-F** _file_] [**--edit**] [**-a** _users_] [**-M** _milestone_] [**-l** _labels_]

**hub issue transfer** _number_ _repository_

# SUBCOMMANDS

**list**
> List issues in the current repository (default when no subcommand is given).

**show** _number_
> Show an existing issue.

**create**
> Open a new issue in the current repository.

**update** _number_
> Update fields of an existing issue.

**labels**
> List the labels available in this repository.

**transfer** _number_ _repository_
> Transfer an issue to another repository.

# PARAMETERS

**-a**, **--assignee** _user_
> In list mode, show only issues assigned to _user_. In create/update mode (**--assign**), a comma-separated list of users to assign.

**-c**, **--creator** _user_
> Show only issues created by _user_.

**-@**, **--mentioned** _user_
> Show only issues mentioning _user_.

**-s**, **--state** _state_
> Show issues with state **open**, **closed**, or **all** (default: open).

**-f**, **--format** _format_
> Customize output using placeholders such as %i (number), %t (title), %S (state), %l (labels), %b (body), %au (author).

**-M**, **--milestone** _name_
> Show only issues for the given milestone.

**-l**, **--labels** _labels_
> Show only issues with the given comma-separated labels.

**-d**, **--since** _date_
> Show only issues updated on or after _date_ (ISO 8601).

**-L**, **--limit** _n_
> Show only the first _n_ issues.

**-m**, **--message** _msg_
> Issue title/body text (repeatable; first line is the title).

**-F**, **--file** _file_
> Read the issue title and description from _file_.

**--edit**
> Open the title and description in a text editor before submitting.

**-o**, **--browse**
> Open the new issue in a web browser instead of printing its URL.

**--include-pulls**
> Include pull requests alongside issues.

# DESCRIPTION

**hub issue** manages GitHub issues from the command line. List, create, update, and view issues without leaving the terminal.

With no arguments, it lists open issues for the current repository, sorted by creation date. Subcommands cover viewing a single issue, filing new ones, editing existing ones, listing labels, and transferring an issue to another repository.

# CAVEATS

Part of **hub**, which is deprecated in favor of the official GitHub CLI (**gh**); consider using **gh issue** instead. Requires GitHub authentication.

# INSTALL

```apt: sudo apt install hub```

```pacman: sudo pacman -S hub```

```zypper: sudo zypper install hub```

```brew: brew install hub```

```nix: nix profile install nixpkgs#hub```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[hub](/man/hub)(1), [gh-issue](/man/gh-issue)(1)

# RESOURCES

```[Source code](https://github.com/github/hub)```

```[Homepage](https://hub.github.com/)```

<!-- verified: 2026-07-19 -->

