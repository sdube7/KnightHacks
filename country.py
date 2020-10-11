import requests
import csv

url = "https://restcountries.eu/rest/v2/alpha/"
res_file = open("results.txt", "w")
mylist = []
with open("country.csv") as csvfile:
    myfile = csv.reader(csvfile, delimiter = ",")
    for row in myfile:
        mylist.append(row[0])
for item in mylist:
    List1 = []
    print(item)
    finalUrl = url + item;
    try:
        r = requests.get(finalUrl)
        data = r.json()
    except Exception:
        print("You entered an invalid Country ID")
    for key in data:
        if key == "alpha3Code":
            res_file.write(str(data[key]) + ";")
    for key in data:
        if key == "name":
            res_file.write(str(data[key]))
        if key == "languages":
            res_file.write(";" + str(data[key][0]["name"]) + "\n")
        if key == "region":
            res_file.write(";" + str(data[key]))
        if key == "subregion":
            res_file.write(";" + str(data[key]))
        if key == "capital":
            try:
                res_file.write(";" + str(data[key]))
            except:
                res_file.write(";" + item)
        if key == "population":
            res_file.write(";" + str(data[key]))
        if key == "currencies":
            try:
                res_file.write(";" + str(data[key][0]["name"]))
            except:
                res_file.write(";" + "unknown")
        if key == "callingCodes":
            res_file.write(";" + str(data[key][0]))
        if key == "area":
            res_file.write(";" + str(data[key]))
        if key == "borders":
            res_file.write(";" + "[")
            List1 = (data[key])
            try:
                for item in range(0, len(List1) - 1):
                    res_file.write(List1[item] + ",")
                res_file.write(List1[len(List1)-1] + "]")
            except:
                res_file.write("]")
res_file.close()
