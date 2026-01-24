# TLDR

**Run Streamlit app**

```streamlit run [app.py]```

**Run with specific port**

```streamlit run [app.py] --server.port [8501]```

**Run with arguments**

```streamlit run [app.py] -- [--arg1] [--arg2]```

**Show configuration**

```streamlit config show```

**Create hello app**

```streamlit hello```

**Clear cache**

```streamlit cache clear```

**Show version**

```streamlit version```

# SYNOPSIS

**streamlit** [_run_] [_config_] [_cache_] [_options_] [_file_] [_-- args_]

# PARAMETERS

**run** _FILE_
> Run Streamlit app.

**hello**
> Run demo app.

**config show**
> Show configuration.

**cache clear**
> Clear cache.

**version**
> Show version.

**--server.port** _PORT_
> Server port.

**--server.address** _ADDR_
> Server address.

**--server.headless** _BOOL_
> Run without browser.

**--browser.serverAddress** _ADDR_
> Browser server address.

**--theme.base** _THEME_
> Theme (light/dark).

**--global.developmentMode** _BOOL_
> Development mode.

# DESCRIPTION

**streamlit** creates web applications from Python scripts. Data apps, dashboards, and ML demos are built without web development knowledge.

Apps are Python scripts using Streamlit's API. Widgets like sliders, buttons, and text inputs are added with single function calls.

Hot reload automatically updates the app when code changes. The development workflow is fast and interactive.

Caching decorators prevent recomputation of expensive operations. Data loads and model inference are cached across reruns.

Deployment options include Streamlit Community Cloud, which hosts apps from GitHub for free. Self-hosting is also supported.

Components extend functionality. Custom widgets, visualizations, and integrations are available from the ecosystem.

# CAVEATS

Not suited for complex web apps. Limited layout control. Session state needs explicit management. Large apps may have performance issues.

# HISTORY

**Streamlit** was created by **Adrien Treuille**, **Thiago Teixeira**, and **Amanda Kelly** in **2019**. It rapidly gained popularity for data science prototyping and was acquired by **Snowflake** in **2022**.

# SEE ALSO

[gradio](/man/gradio)(1), [dash](/man/dash)(1), [flask](/man/flask)(1), [python](/man/python)(1)
