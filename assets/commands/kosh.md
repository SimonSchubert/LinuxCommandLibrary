# TAGLINE

Fast Bash-compatible shell, formatter, linter, and language server

# TLDR

**Start** an interactive session

```kosh```

**Run** a script

```kosh [script.sh]```

**Run** a command string

```kosh -c '[command]'```

**Lint** scripts (ShellCheck-style, analysis only)

```kosh --lint [script.sh]```

**Format** a script to standard output

```kosh --format [script.sh]```

**Apply** safe lint fixes and formatting **in place**

```kosh --lint --format --apply [script.sh]```

Run as **Dash/POSIX** or **Bash** (diagnostics off by default)

```kosh --mood sh [script.sh]```

```kosh --mood bash [script.sh]```

Honor each script's **shebang** mood (`sh`/`dash`/`bash`)

```kosh -I [script.sh]```

Start a **language server** on stdin/stdout

```kosh --language-server```

# SYNOPSIS

**kosh** [_options_] [_script_ [_argument_...]]

**kosh** **-c** _command_ [_argument_...]

**kosh** **-s** [_argument_...]

**kosh** **--lint** [**-c** _command_...] [_file_...]

**kosh** **--format** [_file_]

**kosh** **--format** **--apply** _file_...

**kosh** **--lint** [**--format**] **--apply** _file_...

**kosh** **--language-server**

# PARAMETERS

**-c**, **--command=**_COMMAND_
> Read and run COMMAND. Repeatable; strings run in occurrence order.

**-s**, **--stdin**
> Read commands from standard input. Takes precedence over **-c** and a script operand.

**-i**, **--interactive**
> Request an interactive session.

**-l**, **--login**
> Request a login shell (also implied when argv0 starts with a dash).

**-M**, **--mood=**_NAME_
> Select **kosh** (default), **bash**, **sh**, or **bash-posix**. Aliases: **default** for kosh; **posix** and **dash** for sh.

**-I**, **--mimicry**
> Run a script under the mood matching its `sh`/`dash`/`bash` shebang. Current diagnostic settings are kept.

**-L**, **--init-moods=**_LIST_
> Source startup files for each comma-separated mood, in order. Default is the selected runtime mood.

**--lint**
> Analyze without running (like **-n** with every diagnostic tier enabled). Skips startup files. With **--apply**, writes safe structured fixes and re-analyzes.

**--format**
> Format shell source without running it. No file or a lone **-** reads stdin; one named file is written to stdout. Combine with **--apply** to rewrite files.

**--apply**
> Write lint fixes and/or formatted source into named files atomically. Rejects stdin, **-s**, **-i**, **-c**, and a lone **-**.

**--language-server**
> Speak LSP on stdin/stdout. Intended for editors; does not take file operands, **-c**, **-s**, **-i**, **--lint**, **--format**, or **--apply**.

**-n**, **--no-exec**
> Parse and analyze without executing.

**-e**, **--error-exit**
> Exit after an unguarded failing command (errexit).

**-u**, **--no-unset**
> Treat an unset variable read as an error.

**-x**, **--xtrace**
> Print each command after expansion.

**-v**, **--verbose**
> Print each input line as it is read.

**-C**, **--no-clobber**
> Do not overwrite an existing file with a plain `>` redirection.

**-f**, **--no-glob**
> Disable pathname expansion.

**-W**, **-WW**, **-WWW**
> Control analysis severity. In the default mood, **-W** keeps strict/lenient findings as errors; **-WW** demotes lenient errors to warnings; **-WWW** also demotes strict errors. In other moods, **-W**/**-WW**/**-WWW** enable strict, then lenient, then annoying diagnostics as warnings.

**--no-diagnostics**
> Skip the analysis stage.

**--no-annoying-diagnostics**
> Suppress the annoying (style/noisy) tier only.

**--list-diagnostics**
> List analysis checks and exit.

**--clean**
> Skip every startup file and set PATH to `/usr/bin:/bin`.

**--dumb**
> Equivalent to **--mood sh**, **-T**, and **--no-diagnostics**, with color off.

**-r**, **--restricted**
> Restricted mode (PATH/SHELL/HISTFILE/ENV changes, directory changes, and most output redirections are refused after startup).

**-p**, **--privileged**
> Privileged mode. Skip BASH_ENV; skip every startup file when real and effective ids differ.

**--init-file** _FILE_, **--rcfile** _FILE_
> Interactive rc file. Last occurrence wins. In the kosh mood it replaces `/etc/koshrc` and `~/.koshrc`.

**--norc**
> Skip the interactive non-login Bash rc and a custom rc file.

**--posix**
> Select the **bash-posix** mood.

**--enable-koshkit**
> Resolve bundled **koshkit** utility names as commands (`set -o koshkit`).

**-T**, **--no-completion**
> Disable tab completion and ghost text.

**--no-syntax-highlighting**
> Disable syntax coloring and ghost text (completion remains).

**--help**
> Print help and exit.

**--version**
> Print version and notices and exit.

**-V**, **--short-version**
> Print the short version and exit.

# DESCRIPTION

**kosh** is the Koshka shell: a Bash 5.3- and Dash-compatible interpreter, interactive shell, formatter, and language server. Linux, macOS, and Windows are first-tier targets with equivalent grammar. The Linux binary is static and does not link the C++ standard library.

Four **moods** select dialect and strictness. The default **kosh** mood is a strict Bash superset: analysis, **pipefail**, **failglob**, and **nounset** are on. **bash** accepts Bash extensions with analysis off by default. **sh** follows supported Dash behavior. **bash-posix** is Bash syntax with POSIX mode and Bash startup files. A binary named **sh**, **dash**, **bash**, or **rbash** picks the matching mood (and **rbash** also enables restricted mode). `set --mood` changes the mood at runtime.

Before a command runs, Koshka analyzes and may fold constants or drop unreachable code. The catalog includes hundreds of built-in ShellCheck-derived checks plus native analysis. **`kosh --lint`** is the noninteractive reporter; **`kosh --format`** pretty-prints (two-space indent, 80-column wrap, `test` rewritten to `[` unless shadowed). **`kosh --language-server`** provides diagnostics, quick fixes, completion, navigation, semantic tokens, outline, hover, and rename over LSP.

Interactive editing is fish-inspired and does not use readline: syntax highlighting, ghost text, UTF-8 width handling, multiline editing, and persistent history. Extra builtins include **z** (zoxide-style directory jump), **bench** (timing/RSS samples), and **assimilate** (copy this binary onto an SSH host). **koshkit** is a BusyBox-style bundle (`cat`, `cp`, `find`, `grep`, `ps`, `timeout`, and others) invoked as `koshkit` _utility_ or, with **--enable-koshkit**, as those names directly.

# CONFIGURATION

Startup files are ordinary shell source, parsed in the mood that selected them. See **kosh**(5).

**/etc/koshrc**, **~/.koshrc**
> Interactive **kosh** mood rc files (after login profiles). Replaced as a pair by **--rcfile**.

**/etc/profile**, **~/.profile**
> Login files for **kosh** and **sh** moods.

**~/.bash_profile**, **~/.bash_login**, **~/.bashrc**, **/etc/bash.bashrc**
> Bash-mood login and interactive rc files, plus stock bash-completion when present.

**KOSH_FLAGS**
> Default command-line options, parsed before argv. A real flag still wins. **-c**, **--format**, **--apply**, and **--language-server** are discarded from this variable.

**KOSH_HISTORY**
> Command history file (default **~/.kosh_history**).

**KOSH_DIRECTORY_HISTORY**
> Frecency store for the **z** builtin (default **~/.kosh_directory_history**).

**ENV**, **BASH_ENV**
> Extra startup path for interactive **sh** (ENV) and noninteractive **bash** (BASH_ENV). Privileged mode skips both.

**NO_COLOR**
> Nonempty value disables prompt, diagnostic, and **koshkit cat** color.

# CAVEATS

Early-stage software; the authors warn it may still misbehave. Do not replace a production login shell without testing. Default **kosh** mood is much stricter than Bash: unquoted globs, unset reads, and many ShellCheck findings **reject** the script unless you demote them with **-W**/**-WW**/**-WWW**, switch mood, or add a `# shellcheck disable=` comment. Symlinking the binary as **bash** or **sh** disables diagnostics. **--lint --apply** only writes **safe** structured fixes. Debug-only flags (**--debug-logging**, **--ftrace**) are absent from release builds.

# HISTORY

Written from scratch in a C++23 dialect compiled with **-nostdlib++** (links only libc). The project began as a late April Fools' joke under the name **shit**; 0.2.0 renamed the shell to **Koshka** (**koshka** is Russian for cat) and the binary to **kosh**. BSD-3-Clause. Source: **https://github.com/toiletbril/kosh**.

# SEE ALSO

[bash](/man/bash)(1), [dash](/man/dash)(1), [fish](/man/fish)(1), [shellcheck](/man/shellcheck)(1), [busybox](/man/busybox)(1), [ksh](/man/ksh)(1)

# RESOURCES

```[Source code](https://github.com/toiletbril/kosh)```

```[Documentation](https://github.com/toiletbril/kosh/blob/master/docs/kosh.1)```

<!-- verified: 2026-08-29 -->
