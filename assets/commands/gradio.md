# TAGLINE

Machine learning web interface builder

# TLDR

**Run Gradio app**

```python [app.py]```

**Launch with share link**

```gradio [app.py] --share```

**Specify port**

```gradio [app.py] --server-port [7861]```

**Enable debug mode**

```gradio [app.py] --debug```

# SYNOPSIS

**gradio** [_file_] [_options_]

# PARAMETERS

_file_
> Python file with Gradio interface.

**--share**
> Create public shareable link.

**--server-port** _port_
> Port number (default 7860).

**--server-name** _host_
> Host address.

**--debug**
> Enable debug mode.

**--reload**
> Auto-reload on changes.

# DESCRIPTION

**Gradio** is a Python library for creating machine learning demos and web interfaces. It allows rapid prototyping of ML models with interactive UIs, supporting inputs like text, images, audio, and video.

Gradio interfaces can be shared via temporary public URLs, making it easy to demonstrate models to others. It is widely used in the Hugging Face ecosystem.

# PYTHON EXAMPLE

```python
import gradio as gr

def greet(name):
    return f"Hello, {name}!"

demo = gr.Interface(fn=greet, inputs="text", outputs="text")
demo.launch()
```

# CAVEATS

Requires Python 3.7+. Share links expire after 72 hours. Large models need appropriate resources. WebSocket connections required for interactivity.

# HISTORY

Gradio was created by **Abubakar Abid** and team, acquired by **Hugging Face** in **2022**. It revolutionized ML demo creation by making interactive interfaces accessible to researchers without web development expertise.

# SEE ALSO

[streamlit](/man/streamlit)(1), [python](/man/python)(1), [flask](/man/flask)(1)
