# TAGLINE

Monte Carlo tree search over a coding agent

# TLDR

**Search** for a fix with the detected agent and test command

```agent-mcts run "fix the flaky test in tests/test_auth.py"```

Use **Codex** instead of the default agent, and skip the confirm prompt

```agent-mcts run --agent codex -y "fix the flaky test"```

Cap the search at **20 episodes** and **5 dollars**

```agent-mcts run -n 20 --max-cost 5 "speed up the parser"```

**Show** the tree from the latest run

```agent-mcts show```

Show one **node**

```agent-mcts show n3```

**Continue** the latest run with a higher episode budget

```agent-mcts resume -n 20```

**Stage** the best node's diff (you still commit)

```agent-mcts apply```

Print the **version**

```agent-mcts --version```

# SYNOPSIS

**agent-mcts** [_options_] _command_ [_arguments_]

# PARAMETERS

**--version**

> Print the version and exit.

**run** _task_

> Search for a solution to _task_. The working tree must be a Git repository. The search branches from **HEAD** and does not see uncommitted changes.

**-n**, **--max-nodes** _n_

> Episode budget for **run**, or the new total episode budget for **resume**. The root baseline is not an episode. The default budget is **12**.

**--max-cost** _dollars_

> Cost ceiling in US dollars, for agents that report a dollar cost. The default ceiling is **10**.

**--value** _command_

> Command whose exit status and pass ratio score each attempt. When omitted, a test command is detected (**pytest**, **npm test**, **make test**, and similar).

**--model** _name_

> Model override passed to the agent.

**--agent** _claude_|_codex_

> Which agent backend to drive. Default comes from **.agent-mcts.toml** or auto-detection. **claude** is the verified backend. The Codex adapter speaks **codex exec** and, in this tree, is tested against a fake **codex** binary.

**--agent-timeout** _seconds_

> Maximum seconds for one agent episode. The default timeout is **600**. Must be greater than zero.

**-j**, **--parallel** _n_

> How many episodes may run at once. Minimum **1**.

**--judge** / **--no-judge**

> Also score each attempt with an LLM judge. Cannot be combined with **--generate-tests**.

**--generate-tests** / **--no-generate-tests**

> Before the search, have the agent write tests from the task and score attempts on those tests as well. Cannot be combined with **--judge**. Deriving the test command automatically works from a pytest value command; other runners need **generate_command** in the config file.

**-y**, **--yes**

> On **run** and **resume**, do not ask for confirmation.

**resume** [_run-id_]

> Continue a saved run. With no id, the latest run is used. **-n** and **--max-cost** raise the total budget. The run keeps the settings it was started with.

**show** [_node_]

> Print the search tree, or the prompt, summary, and evaluation of one node such as **n3**.

**--run** _id_

> On **show** and **apply**, which run to read. Default is the latest run.

**apply** [_node_]

> Squash-merge that node's branch into the working tree and leave the result staged. With no node, the best scored node is used. You review **git diff --cached** and commit. Apply refuses a dirty work tree.

# DESCRIPTION

**agent-mcts** runs Monte Carlo tree search over a coding agent. Each node is a Git worktree and an agent session. A value command (usually your tests) scores the attempt: exit 0 is a full reward, and a failing run can earn partial credit from a parsed pass ratio. The search spends more episodes on branches that look better. Your current work tree is not modified until **apply**, which squash-merges the chosen branch.

Install it with **uv tool install agent-mcts** (Python 3.11 or newer). The console script is **agent-mcts**. The license is MIT. The project classifiers mark it pre-alpha.

**run** prints the agent, the value command, and the budget, then waits for confirmation unless **-y** is set. While it searches, a tree is drawn in the terminal. Ctrl-C stops the search; the partial tree is still saved. **resume** continues it. A run that already meets the success threshold tells you to **show** and **apply** instead of searching further.

Nodes are Git branches under **agent-mcts/**_run_**/**_node_. An append-only journal records the run so an interrupted search can be inspected.

# CONFIGURATION

**.agent-mcts.toml** in the repository root. Flags override the file for that invocation. A resumed run ignores a newer file and keeps the settings stored with the run.

```
agent = "claude"

[value]
command = "pytest tests/ -x -q"

[search]
max_nodes = 20
max_cost_usd = 10.0
parallelism = 3
```

For a project managed by **uv**, set the value command to **uv run pytest -q** so each fresh worktree can find its environment. The default episode budget is 12 and the default dollar ceiling is 10 when the file does not set them.

# CAVEATS

The search starts from **HEAD**. Uncommitted edits are not visible to the agent. **apply** also refuses to run in a dirty work tree.

**--judge** and **--generate-tests** cannot both be on. **--generate-tests** can invent its per-file command only for pytest; other test runners need an explicit command in the config.

Agents that do not report a dollar cost are limited by the episode budget only. The Codex backend is not verified against the real Codex CLI in this repository. Kimi is described as planned and is not a working backend yet.

**apply** stages a squash merge. It does not commit.

# SEE ALSO

[git](/man/git)(1), [claude](/man/claude)(1)

# RESOURCES

```[Source code](https://github.com/natsu0529/agent-mcts)```

```[Documentation](https://github.com/natsu0529/agent-mcts/blob/main/docs/configuration.md)```

<!-- verified: 2026-11-22 -->
