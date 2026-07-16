# TAGLINE

start and track Copilot coding agent sessions

# TLDR

**Create** a new agent task from a prompt

```gh agent-task create "[refactor the auth module]"```

**Create** a task and follow the session log live

```gh agent-task create "[fix the failing tests]" --follow```

**Create** a task against a different base branch

```gh agent-task create "[add caching]" --base [develop]```

**Read** the prompt from a file or standard input

```gh agent-task create --from-file [prompt.md]```

**List** your most recent agent tasks

```gh agent-task list```

**View** a task and stream its logs

```gh agent-task view [123] --log --follow```

# SYNOPSIS

**gh** **agent-task** _subcommand_ [_options_]

# SUBCOMMANDS

**create** [_prompt_]
> Create a new agent task on the current repository. With no prompt, you are asked to enter one interactively.

**list**
> List your most recent agent tasks.

**view** [_number_]
> View details of an agent task, or of the task associated with a pull request.

# PARAMETERS

**-b**, **--base** _branch_
> create: base branch for the pull request. Defaults to the repository's default branch.

**-a**, **--custom-agent** _name_
> create: use a custom agent, e.g. **my-agent** refers to the **my-agent.md** agent file.

**-F**, **--from-file** _file_
> create: read the task description from a file; use **-** for standard input.

**--follow**
> create, view: follow the agent session logs in real time.

**--log**
> view: show the agent session logs.

**-R**, **--repo** _[HOST/]OWNER/REPO_
> Select another repository instead of the current one.

**-L**, **--limit** _int_
> list: maximum number of agent tasks to fetch (default **30**).

**--json** _fields_
> list, view: output JSON with the specified fields.

**-q**, **--jq** _expression_
> list, view: filter JSON output using a jq expression.

**-t**, **--template** _string_
> list, view: format JSON output using a Go template.

**-w**, **--web**
> list, view: open agent tasks in the browser.

# DESCRIPTION

**gh agent-task** delegates work to the **GitHub Copilot coding agent** from the command line. The agent is asynchronous and autonomous: when you create a task it opens a draft pull request, works on the changes in the background, then requests your review when it is done.

**gh agent-task create** starts a session against the current repository, using your prompt as the task description. Because the agent runs remotely, the command returns immediately unless **--follow** is given, in which case it streams the session log until the agent finishes.

**gh agent-task list** shows running and past sessions, and **gh agent-task view** inspects one of them, optionally streaming its logs. Both support **--json** for scripting; available JSON fields include **id**, **name**, **state**, **createdAt**, **completedAt**, **repository**, **pullRequestNumber**, **pullRequestState**, **pullRequestTitle** and **pullRequestUrl**.

The command group can also be invoked as **gh agent**, **gh agents** or **gh agent-tasks**.

# CAVEATS

Requires **GitHub CLI 2.80.0** or later and an account with **Copilot coding agent** access. The command set is a **public preview** and is subject to change, so flags and output may shift between releases.

Tasks consume Copilot premium requests, and the agent pushes commits to a draft pull request on your behalf. Review its changes before merging.

# HISTORY

The **agent-task** command set was added to the GitHub CLI in **v2.80.0** and announced in **September 2025**, bringing Copilot coding agent sessions to the terminal.

# SEE ALSO

[gh](/man/gh)(1), [gh-copilot](/man/gh-copilot)(1), [gh-pr](/man/gh-pr)(1), [copilot](/man/copilot)(1)

# RESOURCES

```[Source code](https://github.com/cli/cli)```

```[Homepage](https://cli.github.com/)```

```[Documentation](https://cli.github.com/manual/gh_agent-task)```

<!-- verified: 2026-07-16 -->
