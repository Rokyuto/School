USE v_19205;

-- EX2 --
SELECT * FROM Mountain
JOIN Located ON Mountain.id = Located.mountain_id
JOIN Country ON Located.country_code = Country.code
WHERE Country.continent LIKE 'Asia';

-- EX3 --
SELECT * FROM Expedition
JOIN Peak ON Peak.id = Expedition.peak_id
WHERE Peak.name LIKE 'Momblan' AND Expedition.begin_date = '2010-01-01' AND Expedition.end_date = '2019-12-31';

-- EX4 --
SELECT SUM(Alpinist.id) FROM Alpinist
JOIN Participate ON Participate.alpinist_id = Alpinist.id
JOIN Expedition ON Participate.expedition_id = Expedition.id
WHERE Expedition.organizer LIKE 'Министерството на туризма'
GROUP BY Expedition.id;

-- EX5 --
SELECT * FROM Peak
JOIN Mountain ON Mountain.id = Peak.mountain_id
WHERE Mountain.name LIKE 'Himalai' and 
Peak.elevation > (SELECT AVG(Elevation) FROM Peak );
