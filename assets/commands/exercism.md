# TLDR

**Configure with token**

```exercism configure --token=[your_token]```

**Download exercise**

```exercism download --track=[python] --exercise=[hello-world]```

**Submit solution**

```exercism submit [solution.py]```

**List available tracks**

```exercism tracks```

**Show workspace path**

```exercism workspace```

**Open exercise in browser**

```exercism open [path/to/exercise]```

# SYNOPSIS

**exercism** _command_ [_options_]

# DESCRIPTION

**exercism** is the CLI for Exercism, a platform for learning programming languages through practice exercises. It downloads exercises, submits solutions, and manages your local workspace.

The tool integrates with the Exercism website, allowing iteration on exercises with mentor feedback. It supports dozens of programming language tracks.

# PARAMETERS

**configure**
> Set up CLI with API token.

**download**
> Download an exercise.

**submit**
> Submit solution for review.

**tracks**
> List available language tracks.

**workspace**
> Show workspace directory.

**open**
> Open exercise in browser.

**--track** _name_
> Programming language track.

**--exercise** _name_
> Exercise name.

**--token** _token_
> API token for authentication.

**--force**
> Overwrite existing files.

# CAVEATS

Requires Exercism account and API token. Internet connection needed for downloads. Workspace path should be configured correctly. Some exercises require specific language versions.

# HISTORY

**Exercism** was founded by **Katrina Owen** in **2013** as a platform for deliberate practice in programming. The CLI enables offline work on exercises with integration to the web platform for submission and mentoring.

# SEE ALSO

[git](/man/git)(1), [npm](/man/npm)(1), [pip](/man/pip)(1)
