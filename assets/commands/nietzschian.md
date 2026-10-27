# TAGLINE

Socratic debugging session that asks questions instead of patching the code

# TLDR

**Start** a session for a failing build

```nietzschian debug "the tests fail on a clean tree"```

Ask **gentler** questions

```nietzschian debug "login returns 500" --intensity [socrates]```

Ask in the **sharpest** register

```nietzschian debug "the queue stalls under load" -i [zarathustra]```

**Print** the version

```nietzschian --version```

# SYNOPSIS

**nietzschian** **debug** _problem_ [**-i** _intensity_]

**nietzschian** **--version**

# PARAMETERS

_problem_
> What is broken, in your own words. An empty description exits with status **2**.

**-i**, **--intensity** _socrates_|_nietzsche_|_zarathustra_
> How hard the questions push. Names are matched without case. The default is **nietzsche**. **socrates** stays exploratory. **zarathustra** is the sharpest of the three.

# DESCRIPTION

**nietzschian** is an interactive debugger that refuses to hand you a patch. You describe a problem, then answer questions at a **>** prompt until you reach the cause yourself. The console script is **nietzschian** (package **nietzschian-debugger**). It needs Python 3.10 or newer and an Anthropic API key:

```
export ANTHROPIC_API_KEY=your-key
nietzschian debug "the worker drops the second message"
```

During the session, **solved** or **found it** records that you found the cause. **I give up** ends the session without one. **exit** or **quit** leaves early. Ctrl-C and Ctrl-D stop the prompt as well.

A finished session is scored for assumption-checking, evidence gathering, and how quickly the cause was found, then stored under **.nietzschian/sessions/** in the working directory. Saving and scoring are best-effort: a session that cannot be written still prints its closing summary.

# CAVEATS

The key is read from the environment. A missing key exits with status **1** and prints how to set it. An invalid key also exits **1**. Rate limits, connection failures, and other API errors exit **3**. A completed session exits **0**.

Questions go to Anthropic's API, so the problem text and your replies leave the machine. There is one command, **debug**.

# HISTORY

**nietzschian** is published by Dilawar Shafiq as the Nietzschian Debugger. It is written in Python with Click, licensed under MIT.

# SEE ALSO

[gdb](/man/gdb)(1), [lldb](/man/lldb)(1)

# RESOURCES

```[Source code](https://github.com/DilawarShafiq/nietzschian-debugger)```

<!-- verified: 2026-10-27 -->
