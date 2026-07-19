import requests
from bs4 import BeautifulSoup

username = "infantakash210705"
url = f"https://github.com/{username}"

headers = {
    "User-Agent": "Mozilla/5.0"
}

response = requests.get(url, headers=headers)
response.raise_for_status()

soup = BeautifulSoup(response.text, "html.parser")

name = soup.find("span", class_="p-name")
bio = soup.find("div", class_="p-note")

print("Name:", name.get_text(strip=True) if name else "N/A")
print("Bio:", bio.get_text(strip=True) if bio else "N/A")