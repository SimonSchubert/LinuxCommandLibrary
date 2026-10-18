# TAGLINE

Execute Python or a notebook on an active Google Colab session

# TLDR

Execute code from **stdin**

```echo "[print('Hello from Colab')]" | colab exec```

Execute a local **Python file**

```colab exec -f [script.py]```

Execute a **notebook** in a named session

```colab exec -s [session_name] -f [notebook.ipynb]```

Save a generated **plot** to a file

```colab exec -f [plot.py] --output-image [plot.png]```

Raise the **execution timeout**

```colab exec -f [script.py] --timeout [300]```

Set a remote **environment variable**

```colab exec -f [script.py] --env [HF_TOKEN=...]```

# SYNOPSIS

**colab exec** [**-s** _NAME_] [**-f** _FILE_] [**--output-image** _PATH_] [**--timeout** _SEC_] [**--env** _KEY=VALUE_]...

# PARAMETERS

**-s**, **--session** _NAME_
> Session to use. When exactly one session is active, this flag can be omitted.

**-f**, **--file** _FILE_
> Local `.py` script or `.ipynb` notebook. The CLI reads the file on the client and sends the source to the remote kernel; it does not upload the file first.

**--output-image** _PATH_
> Write the last PNG or JPEG `display_data` image to this path.

**--timeout** _SEC_
> Kernel execution timeout in seconds. Default is **30.0**.

**--env** _KEY=VALUE_
> Set `os.environ[KEY]` in the remote kernel before the code runs. Repeatable. `KEY` must be a valid environment-variable name.

# DESCRIPTION

**colab exec** runs Python on an already allocated Colab runtime. It is a subcommand of **colab**, not a separate binary.

Without **-f**, the command reads the program from stdin. A TTY with neither a pipe nor **-f** is an error. Empty input exits 0 without contacting the kernel.

Before user code, the CLI creates `/content` if needed and `chdir`s there. A `.py` file is one code cell. A `.ipynb` file is executed cell by cell; Colab `@title` comments become progress labels, outputs are written back into the notebook object, and the result is saved next to the input as `_output.ipynb` (for `report.ipynb`, that is `report_output.ipynb`). Stream output goes to stdout/stderr; errors print their traceback.

**--env** is prepended as `import os` plus `os.environ[...] = ...` assignments, so it applies inside that kernel execution only.

# CAVEATS

The session must already exist (`colab new` or `colab run --keep`). A 401/404 from the runtime is treated as a lost session: local state is pruned and the command exits 1.

The default **--timeout** of 30 seconds is easy to hit on training or long notebooks. **--output-image** overwrites the path for each image output; only PNG and JPEG are saved that way.

This command does not allocate hardware. Use **colab run** for a one-shot VM, or **colab new --gpu** / **--tpu** first.

# HISTORY

Shipped with the Colab CLI (PyPI `google-colab-cli`) in **2026**. **--env** was added in **0.7.0** (3 September 2026). The CLI itself was announced by Google on **5 June 2026**.

# SEE ALSO

[colab](/man/colab)(1), [colab-run](/man/colab-run)(1), [python3](/man/python3)(1), [jupyter](/man/jupyter)(1), [ipython](/man/ipython)(1)

# RESOURCES

```[Source code](https://github.com/googlecolab/google-colab-cli)```

```[Documentation](https://github.com/googlecolab/google-colab-cli#execution)```

<!-- verified: 2026-10-18 -->
