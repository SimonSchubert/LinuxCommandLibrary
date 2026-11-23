# TAGLINE

Machine learning web interface builder

# TLDR

**Run a Gradio app** with hot-reload (restarts on file changes)

```gradio [app.py]```

**Pass arguments** through to the app script

```gradio [app.py] -- [--name value]```

**Hot-reload a specific demo object** and watch extra directories

```gradio [app.py] --demo-name [my_demo] --watch-dirs [./src]```

**Run directly with Python** (no auto-reload)

```python [app.py]```

**Deploy the current directory** as a Hugging Face Space

```gradio deploy```

**Deploy with a custom title** and entry file

```gradio deploy --title [my-app] --app-file [app.py]```

**Show the API endpoints** of a running app or Space

```gradio info [user/space]```

**Call an endpoint** with a JSON payload

```gradio predict [gradio/calculator] [/predict] '{"num1": 5, "operation": "add", "num2": 3}'```

**Print the Gradio environment info** for bug reports

```gradio environment```

# SYNOPSIS

**gradio** _file_ [**--demo-name** _name_] [**--watch-dirs** _dir_] [**--encoding** _enc_] [**--** _app-args_]

**gradio** **deploy** [**--title** _title_] [**--app-file** _file_] [**--provider** _spaces|gcloud_]

**gradio** **info** _space-or-url_

**gradio** **predict** _space-or-url_ _endpoint_ _json_

**gradio** **environment**

**gradio** **cc** _subcommand_

# PARAMETERS

_file_
> Python file containing a Gradio app. Running **gradio file.py** launches it with auto-reload, equivalent to **python file.py** but restarting on edits.

**--demo-name** _name_
> Name of the Blocks/Interface variable inside the script. Detected automatically if not given.

**--watch-dirs** _dir_
> Additional directory to watch for hot-reload (repeatable). The script's directory and the current directory are always watched.

**--encoding** _enc_
> Encoding of the source file (default: **utf-8**).

**--** _app-args_
> Everything after **--** is passed to the app script, e.g. for argparse.

**--vibe** _file_
> Open the app in vibe mode, an in-browser chat for editing the app with natural language. Anyone who can reach the server can modify files and run code.

**deploy**
> Subcommand: upload the current directory to Hugging Face Spaces (or Google Cloud Run), respecting **.gitignore**.

**--title** _title_
> (**deploy**) Name the Hugging Face Space.

**--app-file** _file_
> (**deploy**) Path to the entry Python file (default: **app.py**).

**--provider** _spaces|gcloud_
> (**deploy**) Deployment target (default: **spaces**). **gcloud** deploys to Google Cloud Run via the **gcloud** CLI.

**info**
> Subcommand: print the JSON parameter and return schema of every endpoint of a Gradio app or Space.

**predict**
> Subcommand: send a prediction request to an endpoint and print the JSON result.

**environment**
> Subcommand: print Gradio, Python, and OS version info useful for issue reports.

**cc**, **component**
> Subcommand group for custom components: **create**, **dev**, **build**, **publish**, and more.

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

The CLI also exposes **gradio deploy**, which packages the working directory and pushes it to **Hugging Face Spaces** (or Google Cloud Run) for hosting, **gradio info** and **gradio predict** for calling apps from the shell, **gradio cc** for building custom components, and **gradio environment**, which prints diagnostic information. Server settings such as port, host, share links, and authentication are normally configured via arguments to **demo.launch()** inside the Python script, or via **GRADIO_*** environment variables.

# PYTHON EXAMPLE

```python
import gradio as gr

def greet(name):
    return f"Hello, {name}!"

demo = gr.Interface(fn=greet, inputs="text", outputs="text")
demo.launch()
```

# CAVEATS

The **gradio** CLI is thin: most configuration happens in **demo.launch(...)** inside your Python script, not via flags. Share links created with **share=True** expire after 1 week and tunnel through Gradio infrastructure. **gradio deploy** requires a Hugging Face token with write access (via **hf auth login**, or it prompts for one). Requires Python 3.10+.

# HISTORY

Gradio was created by **Abubakar Abid** and team in **2019** and acquired by **Hugging Face** in **December 2021**. It made ML demo creation accessible to researchers without web development expertise.

# SEE ALSO

[streamlit](/man/streamlit)(1), [python](/man/python)(1), [flask](/man/flask)(1), [uvicorn](/man/uvicorn)(1), [huggingface-cli](/man/huggingface-cli)(1), [hf](/man/hf)(1)

# RESOURCES

```[Source code](https://github.com/gradio-app/gradio)```

```[Homepage](https://gradio.app/)```

```[Documentation](https://gradio.app/docs)```

<!-- verified: 2026-11-23 -->
