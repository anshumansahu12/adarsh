import pandas as pd
import numpy as np
import matplotlib as mp
import seaborn as sp 


print("pandas verson:",pd.__version__)
print("numpy version:",np.__version__)
print("matplotlib version:",mp.__version__)
print("seaborn version:",sp.__version__)



import pandas as pd
df=pd.read_csv("/home/computer/Downloads/pra.csv")
print(df.head())
print(df.columns)
print(df.describe())
df.to_csv("modified.csv",index=False)

