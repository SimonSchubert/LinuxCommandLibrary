# TAGLINE

Machine learning web interface builder

# TLDR

**Run a Gradio app** with hot-reload (restarts on file changes)

```gradio [app.py]```

**Run directly with Python** (no auto-reload)

```python [app.py]```

**Deploy the current directory** as a Hugging Face Space

```gradio deploy```

**Deploy with a custom title** and entry file

```gradio deploy --title [my-app] --app-file [app.py]```

**Print the Gradio environment info** for bug reports

```gradio environment```

**Run with debug output** enabled

```GRADIO_DEBUG=1 python [app.py]```

# SYNOPSIS

**gradio** _file_ [**--demo-name** _name_] [**--watch-dirs** _dirs_]

**gradio** **deploy** [**--title** _title_] [**--app-file** _file_]

**gradio** **environment**

# PARAMETERS

_file_
> Python file containing a Gradio app. Running **gradio file.py** launches it with auto-reload, equivalent to **python file.py** but restarting on edits.

**deploy**
> Subcommand: upload the current directory to Hugging Face Spaces, respecting **.gitignore**.

**environment**
> Subcommand: print Gradio, Python, and OS version info useful for issue reports.

**--title** _title_
> (**deploy**) Name the Hugging Face Space.

**--app-file** _file_
> (**deploy**) Path to the entry Python file (default: **app.py**).

**--demo-name** _name_
> Name of the demo variable inside the script (default: **demo**).

**--watch-dirs** _dirs_
> Additional directories to watch for hot-reload.

# ENVIRONMENT

**GRADIO_SERVER_PORT**
> Port to bind (default: **7860**).

**GRADIO_SERVER_NAME**
> Interface to bind. Use **0.0.0.0** to listen on all interfaces.

**GRADIO_DEBUG**
> Set to **1** to keep the main thread alive and print stack traces (useful in Colab).

**GRADIO_TEMP_DIR**
> Directory for temporary files such as uploaded media.

# DESCRIPTION

**Gradio** is a Python library for building machine-learning demos and web UIs, plus a small companion CLI. The **gradio** command wraps **python** to run a script with live reload - whenever the watched files change, the server restarts and the browser refreshes automatically, which is the main reason to use **gradio app.py** instead of **python app.py** during development.

The CLI also exposes **gradio deploy**, which packages the working directory and pushes it to **Hugging Face Spaces** for hosting, and **gradio environment**, which prints diagnostic information. Server settings such as port, host, share links, and authentication are normally configured via arguments to **demo.launch()** inside the Python script, or via **GRADIO_*** environment variables.

# PYTHON EXAMPLE

```python
import gradio as gr

def greet(name):
    return f"Hello, {name}!"

demo = gr.Interface(fn=greet, inputs="text", outputs="text")
demo.launch()
```

# CAVEATS

The **gradio** CLI is thin: most configuration happens in **demo.launch(...)** inside your Python script, not via flags. Share links created with **share=True** expire after 72 hours and tunnel through Gradio infrastructure. **gradio deploy** requires a Hugging Face token (via **huggingface-cli login**). Requires Python 3.10+ in recent versions.

# HISTORY

Gradio was created by **Abubakar Abid** and team, acquired by **Hugging Face** in **2022**. It revolutionized ML demo creation by making interactive interfaces accessible to researchers without web development expertise.

# SEE ALSO

[streamlit](/man/streamlit)(1), [python](/man/python)(1), [flask](/man/flask)(1), [uvicorn](/man/uvicorn)(1), [huggingface-cli](/man/huggingface-cli)(1)
