# TAGLINE

Customize key bindings for less

# TLDR

**Compile** the default key binding source file

```lesskey```

**Compile** a specific key binding file

```lesskey [path/to/lesskey_file]```

**Compile** with a custom output file

```lesskey -o [path/to/output] [path/to/lesskey_file]```

**Print** the version number

```lesskey -V```

# SYNOPSIS

**lesskey** [**-o** _output_] [**--**] [_input_]

# PARAMETERS

**-o** _file_, **--output=**_file_
> Specify the output file for the compiled binary key binding file. Defaults to **~/.less**

**-V**, **--version**
> Display the version number of lesskey

**--**
> Marks the end of options; useful if the input filename begins with a dash

# DESCRIPTION

**lesskey** is used to specify or customize key bindings for the **less** pager. It reads a source file containing key binding definitions and compiles it into a binary file that less reads at startup. The default input file is **~/.lesskey** and the default output file is **~/.less**.

The lesskey source file can contain up to four sections, each introduced by a header line: **#command** for key bindings, **#line-edit** for editing behavior at the search prompt, **#env** for environment variables, and **#stop** to mark end of file.

In the **#command** section, each line maps a key sequence to a less action. Keys can be specified as literal characters, control characters (**^X**), escape sequences (**\e**), or special keys like arrows (**\ku**, **\kd**, **\kr**, **\kl**), page up/down (**\kU**, **\kD**), home (**\kh**), end (**\ke**), and delete (**\kx**).

The **#line-edit** section controls behavior at the search and command prompts with actions like **forw-complete**, **back-complete**, **delete**, **backspace**, **home**, **end**, **up**, **down**, and **abort**.

The **#env** section sets environment variables that less will see at startup, such as **LESS** for default options and **LESSCHARSET** for character set configuration.

# CONFIGURATION

The lesskey source file uses a simple text format. Example **~/.lesskey**:

```
#command
j      forw-line
k      back-line
\kd    forw-line
\ku    back-line
gg     goto-line
G      goto-end
q      quit

#line-edit
^A     home
^E     end
^U     abort

#env
LESS = -i -M -R
```

Actions available in the **#command** section include **forw-line**, **back-line**, **forw-screen**, **back-screen**, **forw-scroll**, **back-scroll**, **goto-line**, **goto-end**, **repaint**, **quit**, **search**, and many more. Use the action **invalid** to explicitly undefine a key.

# CAVEATS

In **less version 583** and later, less reads the **~/.lesskey** source file directly without needing to compile it via lesskey. The lesskey binary is considered **deprecated** in modern versions, though it is still distributed. If both **~/.lesskey** (source) and **~/.less** (compiled) exist, newer versions of less prefer the source file. The compiled binary format is not portable across architectures or less versions. The **#env** section can set **LESSOPEN** and **LESSCLOSE** which execute external commands, so lesskey files from untrusted sources should be treated with caution.

# HISTORY

**lesskey** was created by **Mark Nudelman** as a companion utility to the **less** pager, which he developed starting in **1983** as a replacement for **more**. Historically, less required a compiled binary key binding file because parsing a text file at startup was considered too slow. Starting with less version **583** (circa 2021), less gained the ability to read the lesskey source file directly, making the lesskey compilation step optional.

# SEE ALSO

[less](/man/less)(1), [more](/man/more)(1)
